package org.sketcher;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "dGFoVFJVVl9NQ0lNaFhKRW5sNmp6RHc6MQ")
public class SketcherApplication extends Application {
	@Override
	public void onCreate() {
		ACRA.init(this);
		super.onCreate();
	}
}
