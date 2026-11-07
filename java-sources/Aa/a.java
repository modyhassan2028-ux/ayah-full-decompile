package Aa;

import G.C0169c;
import H7.M;
import H9.v;
import I1.I;
import I1.S;
import J1.d;
import J3.x;
import K9.C0395m;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import N9.U;
import T1.C0487d;
import T1.C0492i;
import T1.C0495l;
import T1.X;
import Z0.B;
import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.media.session.p;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.w;
import androidx.viewpager2.widget.ViewPager2;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.C0800d;
import com.google.android.gms.internal.measurement.C0810f;
import com.google.android.gms.internal.measurement.C0815g;
import com.google.android.gms.internal.measurement.C0845m;
import com.google.android.gms.internal.measurement.C0855o;
import com.google.android.gms.internal.measurement.C0879t;
import com.google.android.gms.internal.measurement.C0902x2;
import com.google.android.gms.internal.measurement.C0906y1;
import com.google.android.gms.internal.measurement.CallableC0811f0;
import com.google.android.gms.internal.measurement.InterfaceC0850n;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.w4;
import i7.C0985h0;
import i7.C1023u0;
import i7.G;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import ka.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013b2.u;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.K;
import p056f2.N;
import p056f2.Q;
import p071g9.f;
import p110k9.y;
import p120l9.s;
import p140o.k;
import p140o.r;
import p140o.z;
import p151p.C1256n;
import p151p.V;
import p174r3.l;
import p185s8.u0;
import p207v2.C1369g;
import p207v2.l0;
import p214w.AbstractC1389b;
import p214w.J;
import p223x.A0;
import p223x.AbstractC1427p;
import p223x.InterfaceC1428q;
import p223x.InterfaceC1436z;
import p241y9.e;
import p251z9.j;
import u.C1350e;
import u.C1360o;
import u.E;
import u.O;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements A0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f557u;

    public /* synthetic */ a(Object obj) {
        this.f554r = obj;
    }

    public void A(Q q10) {
        HashMap map = (HashMap) this.f554r;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
        if (abstractComponentCallbacksC0947u.T) {
            ((N) this.f557u).f(abstractComponentCallbacksC0947u);
        }
        if (map.get(abstractComponentCallbacksC0947u.f16165v) == q10 && ((Q) map.put(abstractComponentCallbacksC0947u.f16165v, null)) != null && K.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0947u);
        }
    }

    public void B(String str) {
        j.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            throw new IllegalArgumentException(p245z2.a.D("method ", str, " must have a request body.").toString());
        }
        this.f555s = str;
    }

    public void C(l0 l0Var, e eVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f557u;
        try {
            reentrantLock.lock();
            if (l0Var != null) {
                this.f556t = l0Var;
            }
            eVar.invoke((C1369g) this.f554r, (C1369g) this.f555s);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean D(p130n.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f554r).onActionItemClicked(p(aVar), new r((Context) this.f555s, (C1.a) menuItem));
    }

    public boolean E(p130n.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f554r;
        p130n.e eVarP = p(aVar);
        O o10 = (O) this.f557u;
        Menu zVar = (Menu) o10.get(menu);
        if (zVar == null) {
            zVar = new z((Context) this.f555s, (k) menu);
            o10.put(menu, zVar);
        }
        return callback.onCreateActionMode(eVarP, zVar);
    }

    public void F() {
        TimeZone timeZone = la.e.f19451a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f555s).iterator();
                j.d(it, "iterator(...)");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f556t).size() < 64) {
                        throw null;
                    }
                }
                H();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((ThreadPoolExecutor) j()).isShutdown()) {
            if (arrayList.size() > 0) {
                throw p.u(0, arrayList);
            }
        } else {
            if (arrayList.size() <= 0) {
                return;
            }
            if (arrayList.get(0) != null) {
                throw new ClassCastException();
            }
            j();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [S9.a] */
    public Object G(q9.c cVar) {
        X x9;
        a aVar;
        S9.a aVar2;
        a aVar3;
        if (cVar instanceof X) {
            x9 = (X) cVar;
            int i10 = x9.f7651v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x9.f7651v = i10 - Integer.MIN_VALUE;
            } else {
                x9 = new X(this, cVar);
            }
        } else {
            x9 = new X(this, cVar);
        }
        Object obj = x9.f7649t;
        ?? r10 = x9.f7651v;
        y yVar = y.f19095a;
        p161p9.a aVar4 = p161p9.a.f21156r;
        try {
            if (r10 == 0) {
                p110k9.a.e(obj);
                if (((C0395m) this.f555s).N()) {
                    return yVar;
                }
                S9.c cVar2 = (S9.c) this.f554r;
                x9.f7647r = this;
                x9.f7648s = cVar2;
                x9.f7651v = 1;
                if (cVar2.e(x9) != aVar4) {
                    aVar = this;
                    aVar2 = cVar2;
                }
                return aVar4;
            }
            if (r10 == 1) {
                S9.a aVar5 = x9.f7648s;
                aVar = x9.f7647r;
                p110k9.a.e(obj);
                aVar2 = aVar5;
            } else {
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S9.a aVar6 = x9.f7648s;
                aVar3 = x9.f7647r;
                p110k9.a.e(obj);
                r10 = aVar6;
            }
            ((C0395m) aVar3.f555s).Q(yVar);
            r10.b(null);
            return yVar;
            if (((C0395m) aVar.f555s).N()) {
                aVar2.b(null);
                return yVar;
            }
            x9.f7647r = aVar;
            x9.f7648s = aVar2;
            x9.f7651v = 2;
            if (aVar.h(x9) != aVar4) {
                aVar3 = aVar;
                r10 = aVar2;
                ((C0395m) aVar3.f555s).Q(yVar);
                r10.b(null);
                return yVar;
            }
            return aVar4;
        } catch (Throwable th) {
            r10.b(null);
            throw th;
        }
    }

    public synchronized int H() {
        return ((ArrayDeque) this.f556t).size() + ((ArrayDeque) this.f557u).size();
    }

    public Bundle I(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f555s;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void J() {
        int iA;
        B b5 = (B) this.f555s;
        X4.c cVar = (X4.c) this.f554r;
        ViewPager2 viewPager2 = (ViewPager2) this.f557u;
        int i10 = R.id.accessibilityActionPageLeft;
        S.l(R.id.accessibilityActionPageLeft, viewPager2);
        S.i(0, viewPager2);
        S.l(R.id.accessibilityActionPageRight, viewPager2);
        S.i(0, viewPager2);
        S.l(R.id.accessibilityActionPageUp, viewPager2);
        S.i(0, viewPager2);
        S.l(R.id.accessibilityActionPageDown, viewPager2);
        S.i(0, viewPager2);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.f13046I) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f13052u < iA - 1) {
                S.m(viewPager2, new d(R.id.accessibilityActionPageDown, (String) null), null, cVar);
            }
            if (viewPager2.f13052u > 0) {
                S.m(viewPager2, new d(R.id.accessibilityActionPageUp, (String) null), null, b5);
                return;
            }
            return;
        }
        boolean zB = viewPager2.b();
        int i11 = zB ? 16908360 : 16908361;
        if (zB) {
            i10 = 16908361;
        }
        if (viewPager2.f13052u < iA - 1) {
            S.m(viewPager2, new d(i11, (String) null), null, cVar);
        }
        if (viewPager2.f13052u > 0) {
            S.m(viewPager2, new d(i10, (String) null), null, b5);
        }
    }

    public void K(String str) {
        j.e(str, "url");
        if (v.R0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            j.d(strSubstring, "substring(...)");
            str = "http:".concat(strSubstring);
        } else if (v.R0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            j.d(strSubstring2, "substring(...)");
            str = "https:".concat(strSubstring2);
        }
        j.e(str, "<this>");
        m mVar = new m();
        mVar.c(null, str);
        this.f554r = mVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle L() {
        C0985h0 c0985h0 = (C0985h0) this.f557u;
        if (((Bundle) this.f556t) == null) {
            String str = (String) this.f554r;
            SharedPreferences sharedPreferencesS = c0985h0.s();
            C1023u0 c1023u0 = (C1023u0) c0985h0.f16104r;
            String string = sharedPreferencesS.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                R3.a();
                                                if (c1023u0.f17582u.y(null, G.f16914R0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i11 = 0; i11 < length; i11++) {
                                                        jArr[i11] = jSONArray2.optLong(i11);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                i7.X x9 = c1023u0.f17584w;
                                                C1023u0.m(x9);
                                                x9.f17182w.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            R3.a();
                                            if (c1023u0.f17582u.y(null, G.f16914R0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i12 = 0; i12 < length2; i12++) {
                                                    iArr[i12] = jSONArray3.optInt(i12);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            i7.X x10 = c1023u0.f17584w;
                                            C1023u0.m(x10);
                                            x10.f17182w.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        i7.X x11 = c1023u0.f17584w;
                                        C1023u0.m(x11);
                                        x11.f17182w.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    i7.X x12 = c1023u0.f17584w;
                                    C1023u0.m(x12);
                                    x12.f17182w.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                i7.X x13 = c1023u0.f17584w;
                                C1023u0.m(x13);
                                x13.f17182w.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            i7.X x14 = c1023u0.f17584w;
                            C1023u0.m(x14);
                            x14.f17182w.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f556t = bundle;
                } catch (JSONException unused2) {
                    i7.X x15 = c1023u0.f17584w;
                    C1023u0.m(x15);
                    x15.f17182w.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f556t) == null) {
                this.f556t = (Bundle) this.f555s;
            }
        }
        Bundle bundle2 = (Bundle) this.f556t;
        U6.y.f(bundle2);
        return new Bundle(bundle2);
    }

    public InterfaceC0850n M(a aVar, C0906y1... c0906y1Arr) {
        InterfaceC0850n interfaceC0850nU = InterfaceC0850n.f14367i;
        for (C0906y1 c0906y1 : c0906y1Arr) {
            interfaceC0850nU = g.U(c0906y1);
            u0.R((a) this.f556t);
            if ((interfaceC0850nU instanceof C0855o) || (interfaceC0850nU instanceof C0845m)) {
                interfaceC0850nU = ((C0879t) this.f554r).c(aVar, interfaceC0850nU);
            }
        }
        return interfaceC0850nU;
    }

    public InterfaceC0850n N(InterfaceC0850n interfaceC0850n) {
        return ((C0879t) this.f555s).c(this, interfaceC0850n);
    }

    public InterfaceC0850n O(C0800d c0800d) {
        InterfaceC0850n interfaceC0850nC = InterfaceC0850n.f14367i;
        Iterator itN = c0800d.n();
        while (itN.hasNext()) {
            interfaceC0850nC = ((C0879t) this.f555s).c(this, c0800d.p(((Integer) itN.next()).intValue()));
            if (interfaceC0850nC instanceof C0810f) {
                break;
            }
        }
        return interfaceC0850nC;
    }

    public void P(Bundle bundle) {
        String str = (String) this.f554r;
        C0985h0 c0985h0 = (C0985h0) this.f557u;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesS = c0985h0.s();
        C1023u0 c1023u0 = (C1023u0) c0985h0.f16104r;
        SharedPreferences.Editor editorEdit = sharedPreferencesS.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        R3.a();
                        if (c1023u0.f17582u.y(null, G.f16914R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                i7.X x9 = c1023u0.f17584w;
                                C1023u0.m(x9);
                                x9.f17182w.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                i7.X x10 = c1023u0.f17584w;
                                C1023u0.m(x10);
                                x10.f17182w.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        i7.X x11 = c1023u0.f17584w;
                        C1023u0.m(x11);
                        x11.f17182w.b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f556t = bundle2;
    }

    public a Q() {
        return new a(this, (C0879t) this.f555s);
    }

    public boolean R(String str) {
        if (((HashMap) this.f556t).containsKey(str)) {
            return true;
        }
        a aVar = (a) this.f554r;
        if (aVar != null) {
            return aVar.R(str);
        }
        return false;
    }

    public void S(String str, InterfaceC0850n interfaceC0850n) {
        a aVar;
        HashMap map = (HashMap) this.f556t;
        if (!map.containsKey(str) && (aVar = (a) this.f554r) != null && aVar.R(str)) {
            aVar.S(str, interfaceC0850n);
        } else {
            if (((HashMap) this.f557u).containsKey(str)) {
                return;
            }
            if (interfaceC0850n == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC0850n);
            }
        }
    }

    public void T(String str, InterfaceC0850n interfaceC0850n) {
        HashMap map = (HashMap) this.f556t;
        if (((HashMap) this.f557u).containsKey(str)) {
            return;
        }
        if (interfaceC0850n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0850n);
        }
    }

    public InterfaceC0850n U(String str) {
        HashMap map = (HashMap) this.f556t;
        if (map.containsKey(str)) {
            return (InterfaceC0850n) map.get(str);
        }
        a aVar = (a) this.f554r;
        if (aVar != null) {
            return aVar.U(str);
        }
        throw new IllegalArgumentException(p.z(str, " is not defined"));
    }

    public void a(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (((ArrayList) this.f556t).contains(abstractComponentCallbacksC0947u)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0947u);
        }
        synchronized (((ArrayList) this.f556t)) {
            ((ArrayList) this.f556t).add(abstractComponentCallbacksC0947u);
        }
        abstractComponentCallbacksC0947u.f16128B = true;
    }

    public p071g9.a b(View view) {
        j.e(view, "view");
        M m10 = (M) this.f555s;
        M m11 = (M) this.f557u;
        p071g9.d dVar = (p071g9.d) this.f554r;
        ArrayList arrayList = (ArrayList) this.f556t;
        p071g9.a aVar = new p071g9.a();
        aVar.f16337c = m10;
        aVar.f16338d = m11;
        aVar.f16339e = dVar;
        aVar.f16335a = 0;
        aVar.f16340f = arrayList;
        Object tag = view.getTag(com.ayah.R.id.insetter_initial_state);
        f fVar = tag instanceof f ? (f) tag : null;
        if (fVar == null) {
            fVar = new f(view);
            view.setTag(com.ayah.R.id.insetter_initial_state, fVar);
        }
        K.u0 u0Var = new K.u0(6, aVar, fVar);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(view, u0Var);
        view.addOnAttachStateChangeListener(new H7.K(1));
        if (view.isAttachedToWindow()) {
            I1.G.c(view);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[LOOP:1: B:44:0x00bf->B:46:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:33:0x0093->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object c(q9.c cVar) {
        p248z6.a aVar;
        List list;
        List list2;
        Object objR;
        List listQ0;
        List list3;
        String str;
        BookType bookType;
        Iterator it;
        if (cVar instanceof p248z6.a) {
            aVar = (p248z6.a) cVar;
            int i10 = aVar.f24839v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24839v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new p248z6.a(this, cVar);
            }
        } else {
            aVar = new p248z6.a(this, cVar);
        }
        Object objA = aVar.f24837t;
        int i11 = aVar.f24839v;
        Object obj = null;
        Object[] objArr = 0;
        int i12 = 2;
        p161p9.a aVar2 = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objA);
            D3.c cVar2 = (D3.c) this.f555s;
            aVar.f24839v = 1;
            objA = cVar2.a(aVar);
            if (objA != aVar2) {
            }
            return aVar2;
        }
        if (i11 == 1) {
            p110k9.a.e(objA);
        } else {
            if (i11 == 2) {
                list = aVar.f24835r;
                p110k9.a.e(objA);
                list2 = (List) objA;
                InterfaceC0415h interfaceC0415h = ((x) this.f557u).f4314i;
                aVar.f24835r = list;
                aVar.f24836s = list2;
                aVar.f24839v = 3;
                objR = AbstractC0419l.r(interfaceC0415h, aVar);
                if (objR != aVar2) {
                    List list4 = list;
                    listQ0 = list2;
                    objA = objR;
                    list3 = list4;
                }
                return aVar2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listQ0 = aVar.f24836s;
            list3 = aVar.f24835r;
            p110k9.a.e(objA);
        }
        str = (String) objA;
        if (str == null) {
            str = "";
        }
        for (Object obj2 : list3) {
            if (j.a(((BookType) obj2).f13685a, str)) {
                obj = obj2;
                break;
            }
        }
        bookType = (BookType) obj;
        if (bookType != null && !listQ0.contains(bookType)) {
            listQ0 = p120l9.m.q0(AbstractC0813f2.K(bookType), listQ0);
        }
        it = listQ0.iterator();
        while (it.hasNext()) {
            ((l) this.f556t).e((BookType) it.next());
        }
        return y.f19095a;
        List list5 = (List) objA;
        U u8 = ((p174r3.c) this.f554r).f21517c;
        K4.b bVar = new K4.b(i12, objArr == true ? 1 : 0, 7);
        aVar.f24835r = list5;
        aVar.f24839v = 2;
        Object objQ = AbstractC0419l.q(u8, bVar, aVar);
        if (objQ != aVar2) {
            list = list5;
            objA = objQ;
            list2 = (List) objA;
            InterfaceC0415h interfaceC0415h2 = ((x) this.f557u).f4314i;
            aVar.f24835r = list;
            aVar.f24836s = list2;
            aVar.f24839v = 3;
            objR = AbstractC0419l.r(interfaceC0415h2, aVar);
            if (objR != aVar2) {
                List list6 = list;
                listQ0 = list2;
                objA = objR;
                list3 = list6;
                str = (String) objA;
                if (str == null) {
                    str = "";
                }
                while (r0.hasNext()) {
                    if (j.a(((BookType) obj2).f13685a, str)) {
                        obj = obj2;
                        break;
                    }
                }
                bookType = (BookType) obj;
                if (bookType != null) {
                    listQ0 = p120l9.m.q0(AbstractC0813f2.K(bookType), listQ0);
                }
                it = listQ0.iterator();
                while (it.hasNext()) {
                    ((l) this.f556t).e((BookType) it.next());
                }
                return y.f19095a;
            }
        }
        return aVar2;
    }

    @Override // p223x.x0
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // p223x.x0
    public AbstractC1427p e(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        if (((AbstractC1427p) this.f556t) == null) {
            this.f556t = abstractC1427p3.c();
        }
        AbstractC1427p abstractC1427p4 = (AbstractC1427p) this.f556t;
        if (abstractC1427p4 == null) {
            j.k("velocityVector");
            throw null;
        }
        int iB = abstractC1427p4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC1427p abstractC1427p5 = (AbstractC1427p) this.f556t;
            if (abstractC1427p5 == null) {
                j.k("velocityVector");
                throw null;
            }
            abstractC1427p5.e(i10, ((InterfaceC1428q) this.f554r).get(i10).c(j, abstractC1427p.a(i10), abstractC1427p2.a(i10), abstractC1427p3.a(i10)));
        }
        AbstractC1427p abstractC1427p6 = (AbstractC1427p) this.f556t;
        if (abstractC1427p6 != null) {
            return abstractC1427p6;
        }
        j.k("velocityVector");
        throw null;
    }

    public b f() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        List listH = la.e.h((ArrayList) this.f557u);
        c cVar = (c) this.f554r;
        if (cVar != null && cVar.f560a.getPrivate().getFormat() == null) {
            throw new KeyStoreException("unable to support unencodable private key");
        }
        X509Certificate[] x509CertificateArr = (X509Certificate[]) this.f555s;
        if (x509CertificateArr == null) {
            x509CertificateArr = new X509Certificate[0];
        }
        X509Certificate[] x509CertificateArr2 = (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length);
        char[] cArr = Ba.c.f660a;
        j.e(x509CertificateArr2, "intermediates");
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, cArr);
        if (cVar != null) {
            Certificate[] certificateArr = new Certificate[x509CertificateArr2.length + 1];
            certificateArr[0] = cVar.f561b;
            p120l9.l.b0(0, 0, 12, x509CertificateArr2, certificateArr);
            keyStore.setKeyEntry("private", cVar.f560a.getPrivate(), cArr, certificateArr);
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(j.a(keyStore.getProvider().getName(), "BC") ? "PKIX" : KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        j.b(keyManagers);
        if (keyManagers.length == 1) {
            KeyManager keyManager = keyManagers[0];
            if (keyManager instanceof X509KeyManager) {
                X509KeyManager x509KeyManager = (X509KeyManager) keyManager;
                ArrayList arrayList = (ArrayList) this.f556t;
                j.e(arrayList, "trustedCertificates");
                KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore2.load(null, Ba.c.f660a);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    keyStore2.setCertificateEntry(p123m2.c.r(i10, "cert_"), (Certificate) arrayList.get(i10));
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore2);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                j.b(trustManagers);
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager aVar = (X509TrustManager) trustManager;
                        if (!listH.isEmpty()) {
                            ua.e eVar = ua.e.f22996a;
                            aVar = new Ba.a(aVar, listH);
                        }
                        return new b(x509KeyManager, aVar);
                    }
                }
                String string = Arrays.toString(trustManagers);
                j.d(string, "toString(...)");
                throw new IllegalStateException("Unexpected trust managers: ".concat(string).toString());
            }
        }
        String string2 = Arrays.toString(keyManagers);
        j.d(string2, "toString(...)");
        throw new IllegalStateException("Unexpected key managers:".concat(string2).toString());
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((O) this.f555s).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                g(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(q9.c cVar) {
        C0492i c0492i;
        a aVar;
        C0487d c0487d;
        T1.B b5 = (T1.B) this.f557u;
        if (cVar instanceof C0492i) {
            c0492i = (C0492i) cVar;
            int i10 = c0492i.f7685u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0492i.f7685u = i10 - Integer.MIN_VALUE;
            } else {
                c0492i = new C0492i(this, cVar);
            }
        } else {
            c0492i = new C0492i(this, cVar);
        }
        Object objG = c0492i.f7683s;
        int i11 = c0492i.f7685u;
        if (i11 == 0) {
            p110k9.a.e(objG);
            List list = (List) this.f556t;
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (list == null || list.isEmpty()) {
                c0492i.f7682r = this;
                c0492i.f7685u = 1;
                objG = T1.B.g(b5, false, c0492i);
                if (objG != aVar2) {
                    aVar = this;
                    c0487d = (C0487d) objG;
                }
            } else {
                T1.M mH = b5.h();
                C0495l c0495l = new C0495l(b5, this, null);
                c0492i.f7682r = this;
                c0492i.f7685u = 2;
                objG = mH.b(c0495l, c0492i);
                if (objG != aVar2) {
                    aVar = this;
                    c0487d = (C0487d) objG;
                }
            }
            return aVar2;
        }
        if (i11 == 1) {
            aVar = c0492i.f7682r;
            p110k9.a.e(objG);
            c0487d = (C0487d) objG;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c0492i.f7682r;
            p110k9.a.e(objG);
            c0487d = (C0487d) objG;
        }
        ((T1.B) aVar.f557u).f7567h.E(c0487d);
        return y.f19095a;
    }

    @Override // p223x.x0
    public long i(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        int iB = abstractC1427p.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, ((InterfaceC1428q) this.f554r).get(i10).d(abstractC1427p.a(i10), abstractC1427p2.a(i10), abstractC1427p3.a(i10)));
        }
        return jMax;
    }

    public synchronized ExecutorService j() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f554r) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = la.e.f19452b + " Dispatcher";
                j.e(str, "name");
                this.f554r = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new la.d(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f554r;
            j.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // p223x.x0
    public AbstractC1427p l(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        if (((AbstractC1427p) this.f555s) == null) {
            this.f555s = abstractC1427p.c();
        }
        AbstractC1427p abstractC1427p4 = (AbstractC1427p) this.f555s;
        if (abstractC1427p4 == null) {
            j.k("valueVector");
            throw null;
        }
        int iB = abstractC1427p4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC1427p abstractC1427p5 = (AbstractC1427p) this.f555s;
            if (abstractC1427p5 == null) {
                j.k("valueVector");
                throw null;
            }
            abstractC1427p5.e(i10, ((InterfaceC1428q) this.f554r).get(i10).b(j, abstractC1427p.a(i10), abstractC1427p2.a(i10), abstractC1427p3.a(i10)));
        }
        AbstractC1427p abstractC1427p6 = (AbstractC1427p) this.f555s;
        if (abstractC1427p6 != null) {
            return abstractC1427p6;
        }
        j.k("valueVector");
        throw null;
    }

    public AbstractComponentCallbacksC0947u m(String str) {
        Q q10 = (Q) ((HashMap) this.f554r).get(str);
        if (q10 != null) {
            return q10.f16017c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0947u n(String str) {
        for (Q q10 : ((HashMap) this.f554r).values()) {
            if (q10 != null) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uN = q10.f16017c;
                if (!str.equals(abstractComponentCallbacksC0947uN.f16165v)) {
                    abstractComponentCallbacksC0947uN = abstractComponentCallbacksC0947uN.f16139M.f15964c.n(str);
                }
                if (abstractComponentCallbacksC0947uN != null) {
                    return abstractComponentCallbacksC0947uN;
                }
            }
        }
        return null;
    }

    public void o(oa.m mVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f557u;
        synchronized (this) {
            if (!arrayDeque.remove(mVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        F();
    }

    public p130n.e p(p130n.a aVar) {
        ArrayList arrayList = (ArrayList) this.f556t;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p130n.e eVar = (p130n.e) arrayList.get(i10);
            if (eVar != null && eVar.f19739b == aVar) {
                return eVar;
            }
        }
        p130n.e eVar2 = new p130n.e((Context) this.f555s, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (Q q10 : ((HashMap) this.f554r).values()) {
            if (q10 != null) {
                arrayList.add(q10);
            }
        }
        return arrayList;
    }

    @Override // p223x.x0
    public AbstractC1427p s(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        if (((AbstractC1427p) this.f557u) == null) {
            this.f557u = abstractC1427p3.c();
        }
        AbstractC1427p abstractC1427p4 = (AbstractC1427p) this.f557u;
        if (abstractC1427p4 == null) {
            j.k("endVelocityVector");
            throw null;
        }
        int iB = abstractC1427p4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC1427p abstractC1427p5 = (AbstractC1427p) this.f557u;
            if (abstractC1427p5 == null) {
                j.k("endVelocityVector");
                throw null;
            }
            abstractC1427p5.e(i10, ((InterfaceC1428q) this.f554r).get(i10).e(abstractC1427p.a(i10), abstractC1427p2.a(i10), abstractC1427p3.a(i10)));
        }
        AbstractC1427p abstractC1427p6 = (AbstractC1427p) this.f557u;
        if (abstractC1427p6 != null) {
            return abstractC1427p6;
        }
        j.k("endVelocityVector");
        throw null;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (Q q10 : ((HashMap) this.f554r).values()) {
            if (q10 != null) {
                arrayList.add(q10.f16017c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public C0169c u(Object obj) {
        C0169c c0169c = (C0169c) this.f557u;
        if (this.f556t == obj && c0169c != null) {
            return c0169c;
        }
        E e10 = (E) this.f555s;
        Object objG = e10.g(obj);
        if (objG == null) {
            C0169c c0169c2 = (C0169c) this.f554r;
            C0169c c0169c3 = new C0169c();
            c0169c3.f2669a = c0169c2.f2669a;
            c0169c3.f2670b = c0169c2.f2670b;
            e10.l(obj, c0169c3);
            objG = c0169c3;
        }
        C0169c c0169c4 = (C0169c) objG;
        this.f556t = obj;
        this.f557u = c0169c4;
        return c0169c4;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.f556t).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f556t)) {
            arrayList = new ArrayList((ArrayList) this.f556t);
        }
        return arrayList;
    }

    public AbstractC1427p w(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2) {
        if (((AbstractC1427p) this.f556t) == null) {
            this.f556t = abstractC1427p.c();
        }
        AbstractC1427p abstractC1427p3 = (AbstractC1427p) this.f556t;
        if (abstractC1427p3 == null) {
            j.k("velocityVector");
            throw null;
        }
        int iB = abstractC1427p3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC1427p abstractC1427p4 = (AbstractC1427p) this.f556t;
            if (abstractC1427p4 == null) {
                j.k("velocityVector");
                throw null;
            }
            V v10 = (V) this.f554r;
            abstractC1427p.getClass();
            long j10 = j / 1000000;
            J jA = ((p003a2.d) v10.f20603r).a(abstractC1427p2.a(i10));
            long j11 = jA.f23447c;
            abstractC1427p4.e(i10, (((Math.signum(jA.f23445a) * AbstractC1389b.a(j11 > 0 ? j10 / j11 : 1.0f).f23471b) * jA.f23446b) / j11) * 1000.0f);
        }
        AbstractC1427p abstractC1427p5 = (AbstractC1427p) this.f556t;
        if (abstractC1427p5 != null) {
            return abstractC1427p5;
        }
        j.k("velocityVector");
        throw null;
    }

    public P x(String str, p251z9.e eVar) {
        P p10;
        P pA;
        j.e(str, "key");
        synchronized (((p123m2.b) this.f557u)) {
            try {
                androidx.lifecycle.U u8 = (androidx.lifecycle.U) this.f554r;
                u8.getClass();
                p10 = (P) u8.f12646a.get(str);
                if (eVar.d(p10)) {
                    androidx.lifecycle.S s10 = (androidx.lifecycle.S) this.f555s;
                    if (s10 instanceof androidx.lifecycle.N) {
                        androidx.lifecycle.N n6 = (androidx.lifecycle.N) s10;
                        j.b(p10);
                        w wVar = n6.f12636d;
                        if (wVar != null) {
                            L5.c cVar = n6.f12637e;
                            j.b(cVar);
                            androidx.lifecycle.K.a(p10, cVar, wVar);
                        }
                    }
                    j.c(p10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    p105k2.d dVar = new p105k2.d((p105k2.c) this.f556t);
                    dVar.f18958a.put(T.f12644b, str);
                    androidx.lifecycle.S s11 = (androidx.lifecycle.S) this.f555s;
                    j.e(s11, "factory");
                    try {
                        try {
                            pA = s11.c(eVar, dVar);
                        } catch (AbstractMethodError unused) {
                            pA = s11.a(p171r0.a.d(eVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        pA = s11.b(p171r0.a.d(eVar), dVar);
                    }
                    p10 = pA;
                    androidx.lifecycle.U u10 = (androidx.lifecycle.U) this.f554r;
                    u10.getClass();
                    j.e(p10, "viewModel");
                    P p11 = (P) u10.f12646a.put(str, p10);
                    if (p11 != null) {
                        p11.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p10;
    }

    public void y(String str, String str2) {
        j.e(str2, "value");
        B b5 = (B) this.f556t;
        b5.getClass();
        B0.c.P(str);
        B0.c.Q(str2, str);
        b5.l(str);
        B0.c.o(b5, str, str2);
    }

    public void z(Q q10) {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
        String str = abstractComponentCallbacksC0947u.f16165v;
        HashMap map = (HashMap) this.f554r;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0947u.f16165v, q10);
        if (K.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0947u);
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f554r = obj;
        this.f555s = obj2;
        this.f556t = obj3;
        this.f557u = obj4;
    }

    public a(a aVar, C0879t c0879t) {
        this.f556t = new HashMap();
        this.f557u = new HashMap();
        this.f554r = aVar;
        this.f555s = c0879t;
    }

    public a(C0985h0 c0985h0, String str) {
        this.f557u = c0985h0;
        U6.y.c(str);
        this.f554r = str;
        this.f555s = new Bundle();
    }

    public a(androidx.lifecycle.U u8, androidx.lifecycle.S s10, p105k2.c cVar) {
        j.e(u8, "store");
        j.e(s10, "factory");
        j.e(cVar, "defaultExtras");
        this.f554r = u8;
        this.f555s = s10;
        this.f556t = cVar;
        this.f557u = new p123m2.b();
    }

    public a(Typeface typeface, p023c2.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f557u = typeface;
        this.f554r = bVar;
        this.f556t = new u(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f3677r;
            i10 = ((ByteBuffer) bVar.f3680u).getInt(((ByteBuffer) bVar.f3680u).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f555s = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f3677r;
            i11 = ((ByteBuffer) bVar.f3680u).getInt(((ByteBuffer) bVar.f3680u).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            p013b2.x xVar = new p013b2.x(i16, this);
            p023c2.a aVarB = xVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f3680u).getInt(iA3 + aVarB.f3677r) : 0, (char[]) this.f555s, i16 * 2);
            p023c2.a aVarB2 = xVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f3677r;
                i12 = ((ByteBuffer) aVarB2.f3680u).getInt(((ByteBuffer) aVarB2.f3680u).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            B0.c.g("invalid metadata codepoint length", i12 > 0);
            u uVar = (u) this.f556t;
            p023c2.a aVarB3 = xVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i18 = iA5 + aVarB3.f3677r;
                i13 = ((ByteBuffer) aVarB3.f3680u).getInt(((ByteBuffer) aVarB3.f3680u).getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            uVar.a(xVar, 0, i13 - 1);
        }
    }

    public a(int i10) {
        Object obj = null;
        switch (i10) {
            case 1:
                this.f554r = new C0169c();
                long[] jArr = u.M.f22699a;
                this.f555s = new E();
                break;
            case 6:
                this.f554r = new C1350e(0);
                this.f555s = new SparseArray();
                this.f556t = new C1360o(obj);
                this.f557u = new C1350e(0);
                break;
            case 9:
                C0879t c0879t = new C0879t(0);
                this.f554r = c0879t;
                a aVar = new a((a) null, c0879t);
                this.f556t = aVar;
                this.f555s = aVar.Q();
                C0902x2 c0902x2 = new C0902x2(1);
                this.f557u = c0902x2;
                aVar.S("require", new w4(c0902x2));
                ((HashMap) c0902x2.f14509r).put("internal.platform", CallableC0811f0.f14243a);
                aVar.S("runtime.counter", new C0815g(Double.valueOf(0.0d)));
                break;
            case 11:
                this.f556t = new ArrayList();
                this.f554r = new HashMap();
                this.f555s = new HashMap();
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                this.f555s = new ArrayDeque();
                this.f556t = new ArrayDeque();
                this.f557u = new ArrayDeque();
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                this.f557u = s.f19441r;
                this.f555s = "GET";
                this.f556t = new B(17);
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                this.f554r = new H1.c(10);
                this.f555s = new O(0);
                this.f556t = new ArrayList();
                this.f557u = new HashSet();
                break;
            default:
                this.f556t = new ArrayList();
                this.f557u = new ArrayList();
                break;
        }
    }

    public a(InterfaceC1436z interfaceC1436z) {
        this(new C1256n(12, interfaceC1436z));
    }
}
