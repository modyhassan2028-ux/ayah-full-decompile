package B2;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                j.e(context, "context");
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                j.d(systemService, "context.getSystemService…ementManager::class.java)");
                super((MeasurementManager) systemService);
                break;
            default:
                j.e(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                j.d(measurementManager, "get(context)");
                super(measurementManager);
                break;
        }
    }
}
