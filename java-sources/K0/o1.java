package K0;

import K9.AbstractC0405x;
import N9.AbstractC0419l;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.ayah.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f5142a = new LinkedHashMap();

    public static final N9.i0 a(Context context) {
        N9.i0 i0Var;
        LinkedHashMap linkedHashMap = f5142a;
        synchronized (linkedHashMap) {
            try {
                Object objV = linkedHashMap.get(context);
                if (objV == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    M9.e eVarA = p185s8.u0.a(-1, 6, null);
                    objV = AbstractC0419l.v(new C4.e(new m1(contentResolver, uriFor, new n1(eVarA, p185s8.u0.k(Looper.getMainLooper())), eVarA, context, null)), AbstractC0405x.d(), new N9.h0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objV);
                }
                i0Var = (N9.i0) objV;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i0Var;
    }

    public static final Z.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof Z.r) {
            return (Z.r) tag;
        }
        return null;
    }
}
