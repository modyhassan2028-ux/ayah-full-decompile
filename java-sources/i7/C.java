package i7;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.EnumC0767p;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.ayah.R;
import com.google.android.gms.internal.measurement.C0789a3;
import com.google.android.gms.internal.measurement.C0809e3;
import com.google.android.gms.internal.measurement.C0819g3;
import com.google.android.gms.internal.measurement.C0893v3;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.u4;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import javax.net.ssl.SSLSocket;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements InterfaceC1034y, H7.L, va.l, p226x2.k, x8.c, y8.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static C f16837A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C f16838s = new C(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C f16839t = new C(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C f16840u = new C(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C f16841v = new C(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C f16842w = new C(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C f16843x = new C(5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C f16844y = new C(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C f16845z = new C(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16846r;

    public /* synthetic */ C(int i10) {
        this.f16846r = i10;
    }

    public static p173r2.j f(p013b2.n nVar, p173r2.v vVar, Bundle bundle, EnumC0767p enumC0767p, p173r2.o oVar) {
        String string = UUID.randomUUID().toString();
        p251z9.j.d(string, "toString(...)");
        p251z9.j.e(vVar, "destination");
        p251z9.j.e(enumC0767p, "hostLifecycleState");
        return new p173r2.j(nVar, vVar, bundle, enumC0767p, oVar, string, null);
    }

    @Override // i7.InterfaceC1034y
    public Object a() {
        switch (this.f16846r) {
            case 0:
                List list = G.f16928a;
                Boolean bool = (Boolean) u4.f14428a.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = G.f16928a;
                Boolean bool2 = (Boolean) C0893v3.f14434b.b();
                bool2.getClass();
                return bool2;
            case 2:
                List list3 = G.f16928a;
                R3.f14118s.get();
                Boolean bool3 = (Boolean) T3.f14139f.b();
                bool3.getClass();
                return bool3;
            case 3:
                List list4 = G.f16928a;
                R3.f14118s.get();
                Boolean bool4 = (Boolean) T3.f14140h.b();
                bool4.getClass();
                return bool4;
            case 4:
                List list5 = G.f16928a;
                R3.f14118s.get();
                Boolean bool5 = (Boolean) T3.f14138e.b();
                bool5.getClass();
                return bool5;
            case 5:
                List list6 = G.f16928a;
                Boolean bool6 = (Boolean) C0789a3.f14199a.b();
                bool6.getClass();
                return bool6;
            case 6:
                List list7 = G.f16928a;
                C0809e3.f14239s.get();
                return Integer.valueOf((int) ((Long) C0819g3.f14301n0.b()).longValue());
            default:
                return new Boolean(((Boolean) K3.f14063a.b()).booleanValue());
        }
    }

    @Override // va.l
    public boolean b(SSLSocket sSLSocket) {
        return H9.v.R0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // va.l
    public va.n c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new va.e(superclass);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // y8.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i11 - iIntValue;
            if (i11 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i11 - num.intValue();
                        if (i13 < 10) {
                            System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, iIntValue2);
                            i12 += iIntValue2;
                            i13++;
                        }
                        i10 = (iIntValue2 - 1) + i11;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                        i12++;
                        i13 = 1;
                        i10 = i11;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // x8.c
    public x8.b e(C c10, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        p014b3.c cVar = jSONObject.has("session") ? new p014b3.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), false) : new p014b3.c(new JSONObject().optInt("max_custom_exception_events", 8), false);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        x8.a aVar = new x8.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new x8.b(jCurrentTimeMillis, cVar, aVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // p226x2.k
    public CharSequence j(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f12717j0) ? editTextPreference.f12761r.getString(R.string.not_set) : editTextPreference.f12717j0;
    }

    @Override // H7.L
    public I1.B0 n(View view, I1.B0 b5, H7.M m10) {
        m10.f3461d = b5.a() + m10.f3461d;
        WeakHashMap weakHashMap = I1.S.f3689a;
        boolean z10 = view.getLayoutDirection() == 1;
        int iB = b5.b();
        int iC = b5.c();
        int i10 = m10.f3458a + (z10 ? iC : iB);
        m10.f3458a = i10;
        int i11 = m10.f3460c;
        if (!z10) {
            iB = iC;
        }
        int i12 = i11 + iB;
        m10.f3460c = i12;
        view.setPaddingRelative(i10, m10.f3459b, i12, m10.f3461d);
        return b5;
    }
}
