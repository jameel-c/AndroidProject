package com.example.cashapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class GroupDetailsFragment() :  Fragment(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.group_details_fragment, container, false)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<GroupDetailsFragment> {
        override fun createFromParcel(parcel: Parcel): GroupDetailsFragment {
            return GroupDetailsFragment(parcel)
        }

        override fun newArray(size: Int): Array<GroupDetailsFragment?> {
            return arrayOfNulls(size)
        }
    }
}