package android.support.v4.media.session;

import N9.AbstractC0419l;
import N9.C0410c;
import W.AbstractC0607v1;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import com.google.android.gms.internal.measurement.AbstractC0820h;
import com.google.android.gms.internal.measurement.C0788a2;
import com.google.android.gms.internal.measurement.C0865q;
import com.google.android.gms.internal.measurement.C0879t;
import com.google.android.gms.internal.measurement.InterfaceC0830j;
import com.google.android.gms.internal.measurement.InterfaceC0850n;
import io.realm.ProxyState;
import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p056f2.K;
import p180s0.H;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static String A(StringBuilder sb, int i10, char c10) {
        sb.append(i10);
        sb.append(c10);
        return sb.toString();
    }

    public static String B(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder D(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void E(String str, long j, String str2, StringBuilder sb) {
        sb.append(str + j + str2);
    }

    public static /* synthetic */ String F(int i10) {
        switch (i10) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String G(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String H(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String I(int i10) {
        if (i10 == 1) {
            return "REMOVED";
        }
        if (i10 == 2) {
            return "VISIBLE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static InterfaceC0850n J(InterfaceC0830j interfaceC0830j, C0865q c0865q, Aa.a aVar, ArrayList arrayList) {
        String str = c0865q.f14388r;
        if (interfaceC0830j.e(str)) {
            InterfaceC0850n interfaceC0850nC = interfaceC0830j.c(str);
            if (interfaceC0850nC instanceof AbstractC0820h) {
                return ((AbstractC0820h) interfaceC0850nC).a(aVar, arrayList);
            }
            throw new IllegalArgumentException(z(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(p123m2.c.s("Object has no function ", str));
        }
        u0.H(1, "hasOwnProperty", arrayList);
        return interfaceC0830j.e(((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h()) ? InterfaceC0850n.f14371n : InterfaceC0850n.f14372o;
    }

    public static P a(S s10, p251z9.e eVar, p105k2.d dVar) {
        return s10.b(p171r0.a.d(eVar), dVar);
    }

    public static p055f1.p b(p055f1.p pVar, p055f1.p pVar2) {
        boolean z10 = pVar2 instanceof p055f1.b;
        if (!z10 || !(pVar instanceof p055f1.b)) {
            if (!z10 || (pVar instanceof p055f1.b)) {
                return (z10 || !(pVar instanceof p055f1.b)) ? pVar2.a(new p055f1.o(pVar, 1)) : pVar;
            }
            return pVar2;
        }
        p055f1.b bVar = (p055f1.b) pVar2;
        H h7 = bVar.f15895a;
        float fFloatValue = bVar.f15896b;
        p055f1.o oVar = new p055f1.o(pVar, 0);
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) oVar.invoke()).floatValue();
        }
        return new p055f1.b(h7, fFloatValue);
    }

    public static int c(p063g1.c cVar, float f3) {
        float fW = cVar.w(f3);
        if (Float.isInfinite(fW)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fW);
    }

    public static l0.r d(l0.r rVar, l0.r rVar2) {
        return rVar2 == l0.o.f19333a ? rVar : new l0.l(rVar, rVar2);
    }

    public static float e(long j, p063g1.c cVar) {
        float fC;
        float fN;
        if (!p063g1.p.a(p063g1.o.b(j), 4294967296L)) {
            p063g1.i.b("Only Sp can convert to Px");
        }
        float[] fArr = p075h1.b.f16430a;
        if (cVar.n() >= 1.03f) {
            p075h1.a aVarA = p075h1.b.a(cVar.n());
            fC = p063g1.o.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fN = cVar.n();
        } else {
            fC = p063g1.o.c(j);
            fN = cVar.n();
        }
        return fN * fC;
    }

    public static long f(long j, p063g1.c cVar) {
        if (j != 9205357640488583168L) {
            return u0.b(cVar.d0(Float.intBitsToFloat((int) (j >> 32))), cVar.d0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float g(long j, p063g1.c cVar) {
        if (!p063g1.p.a(p063g1.o.b(j), 4294967296L)) {
            p063g1.i.b("Only Sp can convert to Px");
        }
        return cVar.w(cVar.z(j));
    }

    public static long h(long j, p063g1.c cVar) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fW = cVar.w(p063g1.h.b(j));
        float fW2 = cVar.w(p063g1.h.a(j));
        return (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
    }

    public static long i(p063g1.c cVar, float f3) {
        float[] fArr = p075h1.b.f16430a;
        if (cVar.n() < 1.03f) {
            return F9.n.L(4294967296L, f3 / cVar.n());
        }
        p075h1.a aVarA = p075h1.b.a(cVar.n());
        return F9.n.L(4294967296L, aVarA != null ? aVarA.a(f3) : f3 / cVar.n());
    }

    public static final void j(int i10, View view, ViewGroup viewGroup) {
        p251z9.j.e(view, "view");
        p251z9.j.e(viewGroup, "container");
        if (K.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iB = AbstractC0607v1.b(i10);
        if (iB == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (K.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iB == 1) {
            if (K.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (K.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iB == 2) {
            if (K.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iB != 3) {
            return;
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int k(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i10) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static C0410c l(p085i0.n nVar, Object obj, String str, File file) {
        p251z9.j.e(str, "url");
        ((ArrayList) nVar.f16734t).remove(str);
        return AbstractC0419l.h(new i6.h(file, obj, str, nVar, null));
    }

    public static /* synthetic */ int m(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static float n(float f3, float f7, float f10, float f11) {
        return ((f3 - f7) * f10) + f11;
    }

    public static int o(int i10, int i11, int i12) {
        return C0788a2.w0(i10) + i11 + i12;
    }

    public static int p(int i10, int i11, int i12, int i13) {
        return C0788a2.w0(i10) + i11 + i12 + i13;
    }

    public static int q(Long l10, OsList osList, long j, int i10, int i11) {
        osList.setRow(j, l10.longValue());
        return i10 + i11;
    }

    public static long r(RealmObjectProxy realmObjectProxy) {
        return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
    }

    public static A6.a s(String str) {
        G0.a.c(str);
        return new A6.a();
    }

    public static p061f9.b t(p035d3.u uVar, int i10) {
        return p061f9.a.a(new p035d3.k(uVar, i10, 1));
    }

    public static ClassCastException u(int i10, ArrayList arrayList) {
        arrayList.get(i10).getClass();
        return new ClassCastException();
    }

    public static IllegalArgumentException v(JsonReader jsonReader, String str) throws IOException {
        jsonReader.skipValue();
        return new IllegalArgumentException(str);
    }

    public static String w(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String x(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String y(ProxyState proxyState) {
        return proxyState.getRow$realm().getTable().getName();
    }

    public static String z(String str, String str2) {
        return str + str2;
    }
}
