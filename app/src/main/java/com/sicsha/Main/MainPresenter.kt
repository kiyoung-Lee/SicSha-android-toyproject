package com.sicsha.Main

import android.os.Build
import android.support.annotation.RequiresApi
import com.google.firebase.database.*
import com.sicsha.Main.Data.Menu
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*
import java.util.stream.Collector
import java.util.stream.Collectors
import kotlin.collections.HashMap

/**
 * Created by kiyoungLee on 2017-12-28.
 */
class MainPresenter : MainContract.Presenter {

    val firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()
    val databaseReference: DatabaseReference = firebaseDatabase.getReference()
    var weekMenuList: List<DataSnapshot>? = null
    val defaultCenterName = "DMC산학협력센터"

    override fun start() {
        val menuListener = object : ValueEventListener {
            @RequiresApi(Build.VERSION_CODES.N)
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                weekMenuList = dataSnapshot.children
                                            .filter { date -> is1WeekDate(date.key) }
                                            .toList()

//                val defaultCenterList = weekMenuList?.stream()?.
//                                        map { dataSnapshot -> dataSnapshot.getValue() }?.
//                                        filter { (dataSnapshot as HashMap<String, String>) ->  }?.
//                                        collect(Collectors.toList())

                for(weekMenu in weekMenuList as List<DataSnapshot>){
                    val date = weekMenu.key
                    val centerData = weekMenu.getValue() as Map<Object, Object>
                    var jsonObj:JSONObject = JSONObject(centerData)
                    println("sampe")

                }


                println("test")
            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        }

        databaseReference.child("date").addListenerForSingleValueEvent(menuListener)
        val list = listOf<String>("test","test")
    }

    private fun is1WeekDate(date: String): Boolean {
        val format = SimpleDateFormat("yyyy-MM-dd")
        val parseDate = format.parse(date)

        val calender = Calendar.getInstance()

        calender.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        val monday = calender.time

        calender.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY)
        var friday = calender.time

        val mondayCompare = monday.compareTo(parseDate)
        val fridayCompare = parseDate.compareTo(friday)
        return (mondayCompare < 0  &&  fridayCompare < 0)
    }
}