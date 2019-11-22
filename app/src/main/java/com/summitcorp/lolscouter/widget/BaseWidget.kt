package com.summitcorp.lolscouter.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.summitcorp.lolscouter.R

class BaseWidget : AppWidgetProvider() {
    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
    }

    override fun onUpdate(context: Context?, appWidgetManager: AppWidgetManager?, appWidgetIds: IntArray?) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)

        val remoteView = RemoteViews(context?.packageName, R.layout.widget_base)
        val providerInfo = appWidgetManager?.getAppWidgetInfo(0)
        val width = providerInfo?.minWidth

    }
}