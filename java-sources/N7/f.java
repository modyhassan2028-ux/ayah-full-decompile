package N7;

import K0.W0;
import R0.i;
import R0.p;
import R0.s;
import U0.C0515g;
import android.app.AlarmManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.function.Consumer;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static boolean a(AlarmManager alarmManager) {
        j.e(alarmManager, "alarmManager");
        return Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms();
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void c(p131n0.c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        W0 w9;
        p pVar;
        p241y9.c cVar2;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (w9 = (W0) cVar.d().b((int) jKeyAt)) != null && (pVar = w9.f5032a) != null) {
                Object objG = pVar.f7119d.f7108r.g(i.f7092k);
                if (objG == null) {
                    objG = null;
                }
                R0.a aVar = (R0.a) objG;
                if (aVar != null && (cVar2 = (p241y9.c) aVar.f7069b) != null) {
                }
            }
        }
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Typeface e(Configuration configuration, Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, B9.a.i(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static void f(p131n0.c cVar, long[] jArr, Consumer consumer) {
        p pVar;
        String strA;
        for (long j : jArr) {
            W0 w9 = (W0) cVar.d().b((int) j);
            if (w9 != null && (pVar = w9.f5032a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(cVar.f19802r.getAutofillId(), pVar.g);
                Object objG = pVar.f7119d.f7108r.g(s.f7179z);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = p086i1.a.a(62, "\n", list)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C0515g(strA)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float g(EdgeEffect edgeEffect, float f3, float f7) {
        try {
            return edgeEffect.onPullDistance(f3, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f3, f7);
            return 0.0f;
        }
    }
}
