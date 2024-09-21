package com.github.aakira.expandablelayout.uitest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.github.aakira.expandablelayout.ExpandableLinearLayout
import kotlin.properties.Delegates

class ExpandableLinearLayoutActivity2 : AppCompatActivity() {

    private var expandableLayout: ExpandableLinearLayout by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_linear_layout2)
        supportActionBar?.title = ExpandableLinearLayoutActivity::class.java.simpleName

        expandableLayout = findViewById(R.id.expandableLayout) as ExpandableLinearLayout
        findViewById<View>(R.id.expandButton)?.setOnClickListener { expandableLayout.toggle() }
        findViewById<View>(R.id.moveChildButton)?.setOnClickListener { expandableLayout.moveChild(1) }
        findViewById<View>(R.id.moveChildButton2)?.setOnClickListener { expandableLayout.moveChild(2) }
        findViewById<View>(R.id.moveTopButton)?.setOnClickListener { expandableLayout.move(0) }
        findViewById<View>(R.id.setCloseHeightButton)?.setOnClickListener {
            expandableLayout.closePosition = expandableLayout.currentPosition
        }
    }
}