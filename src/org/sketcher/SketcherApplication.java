package org.sketcher;

import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "dGFoVFJVVl9NQ0lNaFhKRW5sNmp6RHc6MQ", customReportContent = {
		ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME,
		ReportField.PACKAGE_NAME, ReportField.PHONE_MODEL,
		ReportField.STACK_TRACE })
public class SketcherApplication extends Application {
	@Override
	public void onCreate() {
		ACRA.init(this);
		super.onCreate();
	}
}
