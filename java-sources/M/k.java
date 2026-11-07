package M;

import A.C0041r0;
import E2.C0127i0;
import E2.F0;
import E2.L0;
import E2.O0;
import E2.P0;
import E2.Q0;
import F2.t;
import G.B;
import H7.L;
import H7.M;
import I1.B0;
import I1.j0;
import I1.r;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.D0;
import J0.E;
import J0.I;
import J0.InterfaceC0294q;
import K9.AbstractC0405x;
import T1.InterfaceC0491h;
import W.AbstractC0607v1;
import Z.C0672b;
import Z.C0681f0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import p185s8.u0;
import u.AbstractC1361p;
import u.C1360o;
import u.J;
import u.O;
import u.z;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Ca.i, Q2.b, F7.j, r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f5619t;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f5617r = i10;
        this.f5618s = obj;
        this.f5619t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static k e(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new k(26, channel, fileLockLock);
                } catch (IOException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e11) {
                    e = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e12) {
                    e = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e13) {
                e = e13;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void m(I i10) {
        if (i10.f3915X.f3948d == E.f3886v && !i10.q() && !i10.r() && !i10.f3924g0 && i10.I()) {
            l0.q qVar = (l0.q) i10.f3914W.f4067f;
            if ((qVar.f19342u & 256) != 0) {
                while (qVar != null) {
                    if ((qVar.f19341t & 256) != 0) {
                        ?? F10 = qVar;
                        ?? eVar = 0;
                        while (F10 != 0) {
                            if (F10 instanceof InterfaceC0294q) {
                                InterfaceC0294q interfaceC0294q = (InterfaceC0294q) F10;
                                interfaceC0294q.H(AbstractC0283f.v(interfaceC0294q, 256));
                            } else if ((F10.f19341t & 256) != 0 && (F10 instanceof AbstractC0291n)) {
                                l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                                int i11 = 0;
                                F10 = F10;
                                eVar = eVar;
                                while (qVar2 != null) {
                                    if ((qVar2.f19341t & 256) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            eVar = eVar;
                                            F10 = qVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new p011b0.e(new l0.q[16]);
                                            }
                                            if (F10 != 0) {
                                                eVar.b(F10);
                                                F10 = 0;
                                            }
                                            eVar.b(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.f19344w;
                                    F10 = F10;
                                    eVar = eVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F10 = AbstractC0283f.f(eVar);
                        }
                    }
                    if ((qVar.f19342u & 256) == 0) {
                        break;
                    } else {
                        qVar = qVar.f19344w;
                    }
                }
            }
        }
        i10.f3923f0 = false;
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i12 = eVarZ.f13127t;
        for (int i13 = 0; i13 < i12; i13++) {
            m((I) objArr[i13]);
        }
    }

    public static int u(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public void A() throws IOException {
        String str = (String) this.f5618s;
        if (((FileChannel) this.f5619t) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f5619t = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f5619t;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f5619t = null;
            throw new IllegalStateException(p245z2.a.D("Unable to lock file: '", str, "'."), th);
        }
    }

    public void B(int i10, int i11) {
        int[] iArr = (int[]) this.f5618s;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        n(i12);
        int[] iArr2 = (int[]) this.f5618s;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.f5618s, i10, i12, -1);
        ArrayList arrayList = (ArrayList) this.f5619t;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            L0 l10 = (L0) ((ArrayList) this.f5619t).get(size);
            int i13 = l10.f1561r;
            if (i13 >= i10) {
                l10.f1561r = i13 + i11;
            }
        }
    }

    public void C(int i10, int i11) {
        int[] iArr = (int[]) this.f5618s;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        n(i12);
        int[] iArr2 = (int[]) this.f5618s;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.f5618s;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f5619t;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            L0 l10 = (L0) ((ArrayList) this.f5619t).get(size);
            int i13 = l10.f1561r;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((ArrayList) this.f5619t).remove(size);
                } else {
                    l10.f1561r = i13 - i11;
                }
            }
        }
    }

    public void D(F1.j jVar) {
        E1.c cVar = (E1.c) this.f5619t;
        O8.c cVar2 = (O8.c) this.f5618s;
        int i10 = jVar.f2171b;
        if (i10 != 0) {
            cVar.execute(new F1.a(i10, 0, cVar2));
        } else {
            cVar.execute(new p039d8.a(3, cVar2, jVar.f2170a));
        }
    }

    public C0127i0 E(F0 f3, int i10) {
        Q0 q10;
        C0127i0 c0127i0;
        O o10 = (O) this.f5618s;
        int iD = o10.d(f3);
        if (iD >= 0 && (q10 = (Q0) o10.i(iD)) != null) {
            int i11 = q10.f1619a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                q10.f1619a = i12;
                if (i10 == 4) {
                    c0127i0 = q10.f1620b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0127i0 = q10.f1621c;
                }
                if ((i12 & 12) == 0) {
                    o10.g(iD);
                    q10.f1619a = 0;
                    q10.f1620b = null;
                    q10.f1621c = null;
                    Q0.f1618d.c(q10);
                }
                return c0127i0;
            }
        }
        return null;
    }

    public void F(X1.e eVar, Object obj) {
        AbstractC0405x.x((P9.d) this.f5619t, null, new H3.d(this, obj, eVar, (p150o9.c) null), 3);
    }

    public K8.b G() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(r());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = K8.b.f5306h;
        byte b5 = (byte) (((byte) (0 | 2)) | 1);
        int i12 = AbstractC0607v1.c(5)[iOptInt];
        if (i12 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b10 = (byte) (((byte) (b5 | 2)) | 1);
        if (b10 == 3 && i12 != 0) {
            return new K8.b(strOptString, i12, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i12 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b10 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
    }

    public void H() {
        try {
            ((FileLock) this.f5619t).release();
            ((FileChannel) this.f5618s).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void I(F0 f3) {
        Q0 q10 = (Q0) ((O) this.f5618s).get(f3);
        if (q10 == null) {
            return;
        }
        q10.f1619a &= -2;
    }

    public void J(F0 f3) {
        C1360o c1360o = (C1360o) this.f5619t;
        for (int iJ = c1360o.j() - 1; iJ >= 0; iJ--) {
            if (f3 == c1360o.k(iJ)) {
                Object[] objArr = c1360o.f22742t;
                Object obj = objArr[iJ];
                Object obj2 = AbstractC1361p.f22744a;
                if (obj == obj2) {
                    break;
                }
                objArr[iJ] = obj2;
                c1360o.f22740r = true;
                break;
            }
        }
        Q0 q10 = (Q0) ((O) this.f5618s).remove(f3);
        if (q10 != null) {
            q10.f1619a = 0;
            q10.f1620b = null;
            q10.f1621c = null;
            Q0.f1618d.c(q10);
        }
    }

    public void K() {
        synchronized (this) {
            ((AtomicInteger) this.f5618s).decrementAndGet();
            if (((AtomicInteger) this.f5618s).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // F7.j
    public int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((p248z6.c) this.f5618s).f24847s;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.f5619t;
        int i10 = extendedFloatingActionButton2.f14925b0;
        if (i10 != -1) {
            return (i10 == 0 || i10 == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i10;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // F7.j
    public int b() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        p248z6.c cVar = (p248z6.c) this.f5618s;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f5619t;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return cVar.b();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return cVar.b();
    }

    @Override // Q2.b
    public Q2.a c(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        p251z9.j.e(str, "fileName");
        F2.p pVar = (F2.p) this.f5619t;
        if (!str.equals(":memory:")) {
            str = pVar.f2295c.f2251a.getDatabasePath(str).getAbsolutePath();
            p251z9.j.b(str);
        }
        boolean z10 = true;
        G2.a aVar = new G2.a(str, (pVar.f2293a || pVar.f2294b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.f2788a;
        reentrantLock.lock();
        k kVar = aVar.f2789b;
        if (kVar != null) {
            try {
                kVar.A();
            } catch (Throwable th) {
                th = th;
                z10 = false;
            }
        }
        try {
            try {
                if (pVar.f2294b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                Q2.a aVarC = ((Q2.b) this.f5618s).c(str);
                if (pVar.f2293a) {
                    if (pVar.f2295c.g == F2.r.f2316t) {
                        u0.o(aVarC, "PRAGMA synchronous = NORMAL");
                    } else {
                        u0.o(aVarC, "PRAGMA synchronous = FULL");
                    }
                    F2.p.b(aVarC);
                    pVar.f2296d.s(aVarC);
                } else {
                    try {
                        pVar.f2294b = true;
                        F2.p.a(pVar, aVarC);
                        pVar.f2294b = false;
                    } catch (Throwable th2) {
                        pVar.f2294b = false;
                        throw th2;
                    }
                }
                if (kVar != null && (fileChannel2 = (FileChannel) kVar.f5619t) != null) {
                    try {
                        fileChannel2.close();
                        kVar.f5619t = null;
                    } catch (Throwable th3) {
                        kVar.f5619t = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return aVarC;
            } catch (Throwable th4) {
                if (kVar != null && (fileChannel = (FileChannel) kVar.f5619t) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        kVar.f5619t = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z10) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // Ca.i
    public Object d(Ca.q qVar) {
        p251z9.j.e(qVar, "reader");
        return ((Ca.n) this.f5618s).d(qVar);
    }

    public void f(I i10, boolean z10) {
        p248z6.c cVar = (p248z6.c) this.f5619t;
        p248z6.c cVar2 = (p248z6.c) this.f5618s;
        if (z10) {
            cVar2.B(i10);
            cVar.B(i10);
        } else {
            if (((D0) cVar2.f24847s).contains(i10)) {
                return;
            }
            cVar.B(i10);
        }
    }

    public void g(F0 f3, C0127i0 c0127i0) {
        O o10 = (O) this.f5618s;
        Q0 q0A = (Q0) o10.get(f3);
        if (q0A == null) {
            q0A = Q0.a();
            o10.put(f3, q0A);
        }
        q0A.f1621c = c0127i0;
        q0A.f1619a |= 8;
    }

    public boolean h() {
        synchronized (this) {
            if (((AtomicBoolean) this.f5619t).get()) {
                return false;
            }
            ((AtomicInteger) this.f5618s).incrementAndGet();
            return true;
        }
    }

    @Override // F7.j
    public int i() {
        return ((ExtendedFloatingActionButton) this.f5619t).R;
    }

    public void j() {
        int[] iArr = (int[]) this.f5618s;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f5619t = null;
    }

    @Override // Ca.i
    public void k(Ca.r rVar, Object obj) {
        p251z9.j.e(rVar, "writer");
        ((Ca.n) this.f5618s).a(rVar, obj);
        Boolean bool = (Boolean) this.f5619t;
        if (bool != null) {
            rVar.f848b = bool.booleanValue();
        }
    }

    @Override // F7.j
    public int l() {
        return ((ExtendedFloatingActionButton) this.f5619t).Q;
    }

    public void n(int i10) {
        int[] iArr = (int[]) this.f5618s;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f5618s = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f5618s = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f5618s;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View o(int i10, int i11, int i12, int i13) {
        O0 o10 = (O0) this.f5619t;
        P0 p10 = (P0) this.f5618s;
        int iT = p10.t();
        int iJ = p10.j();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewR = p10.r(i10);
            int iM = p10.m(viewR);
            int iV = p10.v(viewR);
            o10.f1597b = iT;
            o10.f1598c = iJ;
            o10.f1599d = iM;
            o10.f1600e = iV;
            if (i12 != 0) {
                o10.f1596a = i12;
                if (o10.a()) {
                    return viewR;
                }
            }
            if (i13 != 0) {
                o10.f1596a = i13;
                if (o10.a()) {
                    view = viewR;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        L l10 = (L) this.f5618s;
        M m10 = (M) this.f5619t;
        M m11 = new M();
        m11.f3458a = m10.f3458a;
        m11.f3459b = m10.f3459b;
        m11.f3460c = m10.f3460c;
        m11.f3461d = m10.f3461d;
        return l10.n(view, b5, m11);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory q(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f5619t) == null) {
            Context context = (Context) this.f5618s;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f5619t = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f5619t = map;
        }
        String str4 = (String) ((Map) this.f5619t).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public File r() {
        if (((File) this.f5618s) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f5618s) == null) {
                        p050e8.f fVar = (p050e8.f) this.f5619t;
                        fVar.a();
                        this.f5618s = new File(fVar.f15843a.getFilesDir(), "PersistedInstallation." + ((p050e8.f) this.f5619t).c() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f5618s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    public InputMethodManager s() {
        return (InputMethodManager) this.f5619t.getValue();
    }

    public H0.I t() {
        return (H0.I) ((C0681f0) this.f5619t).getValue();
    }

    public String toString() {
        switch (this.f5617r) {
            case 21:
                return "Bounds{lower=" + ((A1.c) this.f5618s) + " upper=" + ((A1.c) this.f5619t) + "}";
            default:
                return super.toString();
        }
    }

    public void v(K8.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f5307a);
            jSONObject.put("Status", AbstractC0607v1.b(bVar.f5308b));
            jSONObject.put("AuthToken", bVar.f5309c);
            jSONObject.put("RefreshToken", bVar.f5310d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f5312f);
            jSONObject.put("ExpiresInSecs", bVar.f5311e);
            jSONObject.put("FisError", bVar.g);
            p050e8.f fVar = (p050e8.f) this.f5619t;
            fVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f15843a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(r())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // F7.j
    public ViewGroup.LayoutParams w() {
        int i10 = ((ExtendedFloatingActionButton) this.f5619t).f14925b0;
        if (i10 == 0) {
            i10 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i10);
    }

    public void x() {
        ((SparseIntArray) this.f5618s).clear();
    }

    public boolean y() {
        return !(((D0) ((p248z6.c) this.f5619t).f24847s).isEmpty() && ((D0) ((p248z6.c) this.f5618s).f24847s).isEmpty());
    }

    public boolean z(View view) {
        O0 o10 = (O0) this.f5619t;
        P0 p10 = (P0) this.f5618s;
        int iT = p10.t();
        int iJ = p10.j();
        int iM = p10.m(view);
        int iV = p10.v(view);
        o10.f1597b = iT;
        o10.f1598c = iJ;
        o10.f1599d = iM;
        o10.f1600e = iV;
        o10.f1596a = 24579;
        return o10.a();
    }

    public /* synthetic */ k(int i10, boolean z10) {
        this.f5617r = i10;
    }

    public /* synthetic */ k(View view, Object obj, int i10) {
        this.f5617r = i10;
        this.f5619t = view;
        this.f5618s = obj;
    }

    public k(p174r3.l lVar, p218w3.n nVar) {
        this.f5617r = 5;
        p251z9.j.e(lVar, "bookRepository");
        p251z9.j.e(nVar, "tafsirModel");
        this.f5618s = lVar;
        this.f5619t = nVar;
    }

    public k(I i10, H0.I i11) {
        this.f5617r = 23;
        this.f5618s = i10;
        this.f5619t = C0672b.r(i11);
    }

    public k(String str) {
        this.f5617r = 18;
        this.f5618s = str.concat(".lck");
    }

    public k(t tVar) {
        this.f5617r = 17;
        this.f5618s = new AtomicInteger(0);
        this.f5619t = new AtomicBoolean(false);
    }

    public k(InterfaceC0491h interfaceC0491h) {
        this.f5617r = 19;
        this.f5618s = interfaceC0491h;
        this.f5619t = AbstractC0405x.d();
    }

    public k(F2.p pVar, Q2.b bVar) {
        this.f5617r = 12;
        p251z9.j.e(bVar, "actual");
        this.f5619t = pVar;
        this.f5618s = bVar;
    }

    public k(View view) {
        this.f5617r = 0;
        this.f5618s = view;
        this.f5619t = p110k9.a.c(p110k9.h.f19075s, new C0041r0(18, this));
    }

    public k(p050e8.f fVar) {
        this.f5617r = 29;
        this.f5619t = fVar;
    }

    public k(B b5) {
        this.f5617r = 16;
        this.f5618s = b5;
        z zVar = J.f22695a;
        this.f5619t = new z();
    }

    public k(Context context) {
        this.f5617r = 13;
        this.f5619t = null;
        this.f5618s = context;
    }

    public k(P0 p10) {
        this.f5617r = 9;
        this.f5618s = p10;
        O0 o10 = new O0();
        o10.f1596a = 0;
        this.f5619t = o10;
    }

    public k(WindowInsetsAnimation.Bounds bounds) {
        this.f5617r = 21;
        this.f5618s = j0.g(bounds);
        this.f5619t = j0.f(bounds);
    }

    public k(int i10) {
        this.f5617r = i10;
        switch (i10) {
            case 7:
                this.f5618s = new SparseIntArray();
                this.f5619t = new SparseIntArray();
                break;
            case 10:
                this.f5618s = new O(0);
                this.f5619t = new C1360o((Object) null);
                break;
            case 22:
                this.f5618s = new p248z6.c(17, (byte) 0);
                this.f5619t = new p248z6.c(17, (byte) 0);
                break;
            case 25:
                this.f5618s = new p011b0.e(new I[16]);
                break;
            case 28:
                this.f5618s = new p011b0.e(new Reference[16]);
                this.f5619t = new ReferenceQueue();
                break;
            default:
                this.f5618s = new E0.c(0);
                this.f5619t = new E0.c(0);
                break;
        }
    }
}
