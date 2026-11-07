package android.support.v4.media.session;

import A.C0007a;
import D0.A;
import D0.B;
import D0.C;
import D0.C0096n;
import D0.v;
import H0.InterfaceC0219s;
import J0.I;
import J0.r0;
import K.U;
import K0.X0;
import U6.C0532j;
import W.C0557f1;
import Z.InterfaceC0674c;
import Z.L0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.C0790b;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p013b2.x;
import p013b2.y;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Ca.i, F7.j, InterfaceC0674c, K1.g, R2.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f11362v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f11364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f11365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f11366u;

    public /* synthetic */ r(int i10, boolean z10) {
        this.f11363r = i10;
    }

    public static void C(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(r.class.getClassLoader());
        }
    }

    public static void I(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static Bundle P(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static boolean z(Editable editable, KeyEvent keyEvent, boolean z10) {
        y[] yVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (y[]) editable.getSpans(selectionStart, selectionEnd, y.class)) != null && yVarArr.length > 0) {
                for (y yVar : yVarArr) {
                    int spanStart = editable.getSpanStart(yVar);
                    int spanEnd = editable.getSpanEnd(yVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void A(C0096n c0096n) {
        C c10 = (C) this.f11366u;
        ?? r10 = c0096n.f1119a;
        int size = r10.size();
        int i10 = 0;
        while (true) {
            A a9 = A.f1040s;
            if (i10 >= size) {
                InterfaceC0219s interfaceC0219s = (InterfaceC0219s) this.f11364s;
                if (interfaceC0219s == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                D0.u.h(c0096n, interfaceC0219s.G(0L), new C0007a(5, this, c10), false);
                if (((A) this.f11365t) == a9) {
                    int size2 = r10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((v) r10.get(i11)).a();
                    }
                    J1 j10 = c0096n.f1120b;
                    if (j10 == null) {
                        return;
                    }
                    j10.f14055b = !c10.f1047c;
                    return;
                }
                return;
            }
            if (((v) r10.get(i10)).b()) {
                if (((A) this.f11365t) == a9) {
                    InterfaceC0219s interfaceC0219s2 = (InterfaceC0219s) this.f11364s;
                    if (interfaceC0219s2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    D0.u.h(c0096n, interfaceC0219s2.G(0L), new B(c10, 0), true);
                }
                this.f11365t = A.f1041t;
                return;
            }
            i10++;
        }
    }

    public void B(H6.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f11364s;
        F8.e eVar = new F8.e(byteArrayOutputStream, map, (HashMap) this.f11365t, (C8.d) this.f11366u);
        C8.d dVar = (C8.d) map.get(H6.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
        } else {
            throw new C8.b("No encoder for " + H6.a.class);
        }
    }

    public U D() {
        U u8 = (U) this.f11365t;
        if (u8 != null) {
            return u8;
        }
        p251z9.j.k("keyboardActions");
        throw null;
    }

    public File E(Context context, String str) {
        ((H8.e) this.f11365t).getClass();
        String strMapLibraryName = System.mapLibraryName("realm-jni");
        if (str == null || str.length() == 0) {
            return new File(context.getDir("lib", 0), strMapLibraryName);
        }
        return new File(context.getDir("lib", 0), strMapLibraryName + "." + str);
    }

    public boolean F(CharSequence charSequence, int i10, int i11, x xVar) {
        if ((xVar.f13199c & 3) == 0) {
            p013b2.g gVar = (p013b2.g) this.f11366u;
            p023c2.a aVarB = xVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f3680u).getShort(iA + aVarB.f3677r);
            }
            p013b2.d dVar = (p013b2.d) gVar;
            dVar.getClass();
            ThreadLocal threadLocal = p013b2.d.f13151b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f13152a;
            String string = sb.toString();
            int i12 = A1.d.f466a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i13 = xVar.f13199c & 4;
            xVar.f13199c = zHasGlyph ? i13 | 2 : i13 | 1;
        }
        return (xVar.f13199c & 3) == 2;
    }

    public boolean G() {
        if (((L0) this.f11364s).getValue() != this.f11366u) {
            return true;
        }
        r rVar = (r) this.f11365t;
        return rVar != null && rVar.G();
    }

    public void H(Context context, String str) throws Throwable {
        M.k kVar;
        String[] strArrM;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        H8.e eVar = (H8.e) this.f11365t;
        HashSet hashSet = (HashSet) this.f11364s;
        if (hashSet.contains("realm-jni")) {
            I("%s already loaded previously!", "realm-jni");
            return;
        }
        try {
            eVar.getClass();
            System.loadLibrary("realm-jni");
            hashSet.add("realm-jni");
            I("%s (%s) was loaded normally!", "realm-jni", str);
        } catch (UnsatisfiedLinkError e10) {
            I("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            I("%s (%s) was not loaded normally, re-linking...", "realm-jni", str);
            File fileE = E(context, str);
            if (!fileE.exists()) {
                File dir = context.getDir("lib", 0);
                File fileE2 = E(context, str);
                eVar.getClass();
                File[] fileArrListFiles = dir.listFiles(new A6.b(System.mapLibraryName("realm-jni")));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileE2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                C0532j c0532j = (C0532j) this.f11366u;
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String strMapLibraryName = System.mapLibraryName("realm-jni");
                c0532j.getClass();
                try {
                    M.k kVarJ = C0532j.j(context, strArr, strMapLibraryName);
                    try {
                        if (kVarJ == null) {
                            try {
                                strArrM = C0532j.m(context, strMapLibraryName);
                            } catch (Exception e11) {
                                strArrM = new String[]{e11.toString()};
                            }
                            StringBuilder sbD = p.D("Could not find '", strMapLibraryName, "'. Looked for: ");
                            sbD.append(Arrays.toString(strArr));
                            sbD.append(", but only found: ");
                            throw new A6.a(p.B(sbD, Arrays.toString(strArrM), "."));
                        }
                        ZipFile zipFile = (ZipFile) kVarJ.f5618s;
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            if (i10 >= 5) {
                                break;
                            }
                            I("Found %s! Extracting...", strMapLibraryName);
                            try {
                                if (fileE.exists() || fileE.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) kVarJ.f5619t);
                                        try {
                                            fileOutputStream = new FileOutputStream(fileE);
                                            try {
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j = 0;
                                                    while (true) {
                                                        int i12 = inputStream2.read(bArr);
                                                        if (i12 == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, 0, i12);
                                                        j += (long) i12;
                                                    }
                                                    fileOutputStream.flush();
                                                    fileOutputStream.getFD().sync();
                                                    if (j == fileE.length()) {
                                                        C0532j.b(inputStream2);
                                                        C0532j.b(fileOutputStream);
                                                        fileE.setReadable(true, false);
                                                        fileE.setExecutable(true, false);
                                                        fileE.setWritable(true);
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream = inputStream2;
                                                    C0532j.b(inputStream);
                                                    C0532j.b(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException | IOException unused) {
                                            }
                                        } catch (FileNotFoundException unused2) {
                                            fileOutputStream = null;
                                            C0532j.b(inputStream2);
                                            C0532j.b(fileOutputStream);
                                            i10 = i11;
                                        } catch (IOException unused3) {
                                            fileOutputStream = null;
                                            C0532j.b(inputStream2);
                                            C0532j.b(fileOutputStream);
                                            i10 = i11;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStream2;
                                            fileOutputStream = null;
                                            C0532j.b(inputStream);
                                            C0532j.b(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused4) {
                                        inputStream2 = null;
                                    } catch (IOException unused5) {
                                        inputStream2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = null;
                                    }
                                    C0532j.b(inputStream2);
                                    C0532j.b(fileOutputStream);
                                }
                            } catch (IOException unused6) {
                            }
                            i10 = i11;
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused7) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        kVar = kVarJ;
                        if (kVar != null) {
                            try {
                                ((ZipFile) kVar.f5618s).close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    kVar = null;
                }
            }
            String absolutePath = fileE.getAbsolutePath();
            eVar.getClass();
            System.load(absolutePath);
            hashSet.add("realm-jni");
            I("%s (%s) was re-linked!", "realm-jni", str);
        }
    }

    public void J() {
        r0 r0Var = ((I) this.f11364s).f3901E;
        if (r0Var != null) {
            ((AndroidComposeView) r0Var).C();
        }
    }

    public void K(Activity activity, androidx.window.layout.A a9) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f11366u;
        p251z9.j.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f11365t;
        reentrantLock.lock();
        try {
            if (a9.equals((androidx.window.layout.A) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (androidx.window.layout.u uVar : ((androidx.window.layout.v) ((androidx.window.layout.t) this.f11364s).f13102b).f13109b) {
                if (uVar.f13103a.equals(activity)) {
                    uVar.f13105c = a9;
                    uVar.f13104b.accept(a9);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Object L(CharSequence charSequence, int i10, int i11, int i12, boolean z10, p013b2.p pVar) {
        int i13;
        char c10;
        p013b2.r rVar = new p013b2.r((p013b2.u) ((Aa.a) this.f11365t).f556t);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zB = true;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zB) {
                    SparseArray sparseArray = rVar.f13178c.f13190a;
                    p013b2.u uVar = sparseArray == null ? null : (p013b2.u) sparseArray.get(iCodePointAt);
                    if (rVar.f13176a == 2) {
                        if (uVar != null) {
                            rVar.f13178c = uVar;
                            rVar.f13181f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                rVar.a();
                            } else if (iCodePointAt != 65039) {
                                p013b2.u uVar2 = rVar.f13178c;
                                if (uVar2.f13191b != null) {
                                    if (rVar.f13181f != 1) {
                                        rVar.f13179d = uVar2;
                                        rVar.a();
                                    } else if (rVar.b()) {
                                        rVar.f13179d = rVar.f13178c;
                                        rVar.a();
                                    } else {
                                        rVar.a();
                                    }
                                    c10 = 3;
                                } else {
                                    rVar.a();
                                }
                            }
                            c10 = 1;
                        }
                        c10 = 2;
                    } else if (uVar == null) {
                        rVar.a();
                        c10 = 1;
                    } else {
                        rVar.f13176a = 2;
                        rVar.f13178c = uVar;
                        rVar.f13181f = 1;
                        c10 = 2;
                    }
                    rVar.f13180e = iCodePointAt;
                    if (c10 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c10 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c10 == 3) {
                        if (!z10 && F(charSequence, i13, iCharCount, rVar.f13179d.f13191b)) {
                            break;
                        }
                        zB = pVar.b(charSequence, i13, iCharCount, rVar.f13179d.f13191b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (rVar.f13176a == 2 && rVar.f13178c.f13191b != null && ((rVar.f13181f > 1 || rVar.b()) && i14 < i12 && zB && (z10 || !F(charSequence, i13, iCharCount, rVar.f13178c.f13191b)))) {
            pVar.b(charSequence, i13, iCharCount, rVar.f13178c.f13191b);
        }
        return pVar.a();
    }

    public void M(E6.j jVar, int i10, boolean z10) {
        char c10;
        K6.b bVar = (K6.b) this.f11366u;
        Context context = (Context) this.f11364s;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = jVar.f1937a;
        String str2 = jVar.f1937a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        B6.c cVar = jVar.f1939c;
        adler32.update(byteBufferAllocate.putInt(O6.a.a(cVar)).array());
        byte[] bArr = jVar.f1938b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    Y2.a.v("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((L6.i) ((L6.d) this.f11365t)).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(O6.a.a(cVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(cVar, jLongValue, i10));
            Set set = ((K6.c) bVar.f5246b.get(cVar)).f5249c;
            if (set.contains(K6.d.f5250r)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(K6.d.f5252t)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(K6.d.f5251s)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", O6.a.a(cVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(bVar.a(cVar, jLongValue, i10));
            Integer numValueOf2 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = jVar;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = lValueOf;
            objArr[4] = numValueOf2;
            String strO = Y2.a.O("JobInfoScheduler");
            if (Log.isLoggable(strO, 3)) {
                Log.d(strO, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void N(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f11364s = str;
    }

    public void O(boolean z10) {
        J7.d dVar = (J7.d) this.f11364s;
        if (dVar != null) {
            dVar.b((J7.b) this.f11365t, (View) this.f11366u, z10);
        }
    }

    @Override // F7.j
    public int a() {
        int i10 = ((ExtendedFloatingActionButton) this.f11366u).f14925b0;
        if (i10 == -1) {
            return ((M.k) this.f11364s).a();
        }
        return (i10 == 0 || i10 == -2) ? ((ExtendedFloatingActionButton) ((p248z6.c) this.f11365t).f24847s).getMeasuredHeight() : i10;
    }

    @Override // F7.j
    public int b() {
        int i10 = ((ExtendedFloatingActionButton) this.f11366u).f14924a0;
        if (i10 == -1) {
            return ((M.k) this.f11364s).b();
        }
        return (i10 == 0 || i10 == -2) ? ((p248z6.c) this.f11365t).b() : i10;
    }

    @Override // Z.InterfaceC0674c
    public Object c() {
        return this.f11365t;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f11363r) {
            case 29:
                r rVar = new r(((C0790b) this.f11364s).clone());
                ArrayList arrayList = (ArrayList) this.f11366u;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ArrayList) rVar.f11366u).add(((C0790b) obj).clone());
                }
                return rVar;
            default:
                return super.clone();
        }
    }

    @Override // Ca.i
    public Object d(Ca.q qVar) {
        p251z9.j.e(qVar, "reader");
        Ca.n[] nVarArr = (Ca.n[]) this.f11364s;
        p241y9.c cVar = (p241y9.c) this.f11365t;
        ArrayList arrayList = qVar.f844d;
        arrayList.add(null);
        try {
            ArrayList arrayList2 = new ArrayList();
            while (arrayList2.size() < nVarArr.length) {
                arrayList2.add(nVarArr[arrayList2.size()].d(qVar));
            }
            if (qVar.c() == null) {
                Object objE = cVar.e(arrayList2);
                arrayList.remove(arrayList.size() - 1);
                return objE;
            }
            throw new ProtocolException("unexpected " + qVar.c() + " at " + qVar);
        } catch (Throwable th) {
            arrayList.remove(arrayList.size() - 1);
            throw th;
        }
    }

    @Override // K1.g
    public ClipDescription e() {
        return (ClipDescription) this.f11365t;
    }

    @Override // Z.InterfaceC0674c
    public void f(int i10, Object obj) {
        ((I) this.f11365t).B(i10, (I) obj);
    }

    @Override // Z.InterfaceC0674c
    public void g(Object obj) {
        ((ArrayList) this.f11366u).add(this.f11365t);
        this.f11365t = obj;
    }

    @Override // Z.InterfaceC0674c
    public void h(Object obj, p241y9.e eVar) {
        eVar.invoke(c(), obj);
    }

    @Override // F7.j
    public int i() {
        return ((ExtendedFloatingActionButton) this.f11366u).R;
    }

    @Override // Z.InterfaceC0674c
    public void j() {
        ((I) this.f11365t).c();
    }

    @Override // Ca.i
    public void k(Ca.r rVar, Object obj) {
        p251z9.j.e(rVar, "writer");
        List list = (List) ((p241y9.c) this.f11366u).e(obj);
        Ca.n[] nVarArr = (Ca.n[]) this.f11364s;
        ArrayList arrayList = (ArrayList) rVar.f850d;
        arrayList.add(null);
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Ca.n nVar = nVarArr[i10];
                p251z9.j.c(nVar, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                nVar.a(rVar, list.get(i10));
            }
            arrayList.remove(arrayList.size() - 1);
        } catch (Throwable th) {
            arrayList.remove(arrayList.size() - 1);
            throw th;
        }
    }

    @Override // F7.j
    public int l() {
        return ((ExtendedFloatingActionButton) this.f11366u).Q;
    }

    @Override // Z.InterfaceC0674c
    public /* bridge */ /* synthetic */ void m(int i10, Object obj) {
    }

    @Override // Z.InterfaceC0674c
    public void n(int i10, int i11, int i12) {
        ((I) this.f11365t).L(i10, i11, i12);
    }

    @Override // Z.InterfaceC0674c
    public void o(int i10, int i11) {
        ((I) this.f11365t).R(i10, i11);
    }

    @Override // K1.g
    public Object p() {
        return null;
    }

    @Override // K1.g
    public Uri q() {
        return (Uri) this.f11364s;
    }

    @Override // R2.b
    public R2.c s(r rVar) {
        return new K2.b((Context) rVar.f11364s, (String) this.f11364s, (File) this.f11365t, ((Da.r) rVar.f11366u).f1387s, ((C0532j) this.f11366u).s(rVar));
    }

    @Override // K1.g
    public Uri t() {
        return (Uri) this.f11366u;
    }

    public String toString() {
        switch (this.f11363r) {
            case 26:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f11364s);
                sb.append('{');
                L5.c cVar = (L5.c) ((L5.c) this.f11365t).f5533t;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f5532s;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cVar = (L5.c) cVar.f5533t;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // Z.InterfaceC0674c
    public void u() {
        ArrayList arrayList = (ArrayList) this.f11366u;
        this.f11365t = arrayList.remove(arrayList.size() - 1);
    }

    public void v(int[] iArr, ValueAnimator valueAnimator) {
        H8.e eVar = new H8.e(iArr, valueAnimator);
        valueAnimator.addListener((F7.e) this.f11365t);
        ((ArrayList) this.f11366u).add(eVar);
    }

    @Override // F7.j
    public ViewGroup.LayoutParams w() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f11366u;
        int i10 = extendedFloatingActionButton.f14924a0;
        if (i10 == 0) {
            i10 = -2;
        }
        int i11 = extendedFloatingActionButton.f14925b0;
        return new ViewGroup.LayoutParams(i10, i11 != 0 ? i11 : -2);
    }

    public E6.j x() {
        String strConcat = ((String) this.f11364s) == null ? " backendName" : "";
        if (((B6.c) this.f11366u) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new E6.j((String) this.f11364s, (byte[]) this.f11365t, (B6.c) this.f11366u);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void y() {
        ((ArrayList) this.f11366u).clear();
        this.f11365t = this.f11364s;
        ((I) this.f11364s).Q();
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
        this.f11363r = i10;
        this.f11364s = obj;
        this.f11365t = obj2;
        this.f11366u = obj3;
    }

    public r(Set set, String str, String str2) {
        this.f11363r = 21;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        Map map = Collections.EMPTY_MAP;
        this.f11365t = str2;
        this.f11366u = p099j7.a.f18785a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f11364s = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw p245z2.a.z(it);
    }

    public r(C0790b c0790b) {
        this.f11363r = 29;
        this.f11364s = c0790b;
        this.f11365t = c0790b.clone();
        this.f11366u = new ArrayList();
    }

    public r(X0 x9) {
        this.f11363r = 15;
        this.f11364s = x9;
    }

    public r(int i10) {
        this.f11363r = i10;
        switch (i10) {
            case 11:
                this.f11366u = new ArrayList();
                this.f11364s = null;
                this.f11365t = new F7.e(1, this);
                break;
            case 28:
                this.f11364s = new WeakHashMap();
                this.f11365t = new WeakHashMap();
                this.f11366u = new WeakHashMap();
                break;
            case 29:
                this.f11364s = new C0790b("", 0L, null);
                this.f11365t = new C0790b("", 0L, null);
                this.f11366u = new ArrayList();
                break;
            default:
                H8.e eVar = new H8.e(2);
                C0532j c0532j = new C0532j(1);
                this.f11364s = new HashSet();
                this.f11365t = eVar;
                this.f11366u = c0532j;
                break;
        }
    }

    @Override // K1.g
    public void r() {
    }

    public r(C c10) {
        this.f11363r = 4;
        this.f11366u = c10;
        this.f11365t = A.f1039r;
    }

    public r(J7.b bVar, View view) {
        Object dVar;
        this.f11363r = 14;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            dVar = new J7.f();
        } else {
            dVar = i10 >= 33 ? new J7.d() : null;
        }
        this.f11364s = dVar;
        this.f11365t = bVar;
        this.f11366u = view;
    }

    public r(View view) {
        this.f11363r = 22;
        this.f11364s = view;
        this.f11365t = p110k9.a.c(p110k9.h.f19075s, new C0557f1(8, this));
        this.f11366u = new O8.c(view);
    }

    public r(Runnable runnable) {
        this.f11363r = 12;
        this.f11365t = new CopyOnWriteArrayList();
        this.f11366u = new HashMap();
        this.f11364s = runnable;
    }

    public r(Aa.a aVar, H8.e eVar, p013b2.d dVar, Set set) {
        this.f11363r = 25;
        this.f11364s = eVar;
        this.f11365t = aVar;
        this.f11366u = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            L(str, 0, str.length(), 1, true, new P9.t(str, 1));
        }
    }

    public r(String str) {
        this.f11363r = 26;
        L5.c cVar = new L5.c(21, false);
        this.f11365t = cVar;
        this.f11366u = cVar;
        this.f11364s = str;
    }

    public r(Y0.t tVar, r rVar) {
        this.f11363r = 27;
        this.f11364s = tVar;
        this.f11365t = rVar;
        this.f11366u = tVar.f10372r;
    }

    public r(I i10) {
        this.f11363r = 13;
        this.f11364s = i10;
        this.f11366u = new ArrayList();
        this.f11365t = i10;
    }

    public r(X4.c cVar) {
        this.f11363r = 23;
        this.f11363r = 23;
        this.f11364s = cVar;
        this.f11365t = Choreographer.getInstance();
        this.f11366u = new p003a2.a(this);
    }

    public r(Context context, String str, Da.r rVar) {
        this.f11363r = 19;
        p251z9.j.e(context, "context");
        p251z9.j.e(rVar, "callback");
        this.f11364s = context;
        this.f11365t = str;
        this.f11366u = rVar;
    }

    public r(androidx.window.layout.t tVar) {
        this.f11363r = 24;
        this.f11364s = tVar;
        this.f11365t = new ReentrantLock();
        this.f11366u = new WeakHashMap();
    }

    public r(ExtendedFloatingActionButton extendedFloatingActionButton, M.k kVar, p248z6.c cVar) {
        this.f11363r = 8;
        this.f11366u = extendedFloatingActionButton;
        this.f11364s = kVar;
        this.f11365t = cVar;
    }

    public r(Context context, ComponentName componentName) {
        this.f11363r = 0;
        this.f11366u = new ArrayList();
        if (!TextUtils.isEmpty("QuranMediaSession")) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                this.f11364s = new o(context);
            } else if (i10 >= 28) {
                this.f11364s = new n(context);
            } else {
                this.f11364s = new m(context);
            }
            ((m) this.f11364s).e(new h(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((m) this.f11364s).f11353a.setMediaButtonReceiver(broadcast);
            MediaSessionCompat$Token mediaSessionCompat$Token = ((m) this.f11364s).f11355c;
            X4.c cVar = new X4.c();
            if (mediaSessionCompat$Token != null) {
                DesugarCollections.synchronizedSet(new HashSet());
                if (Build.VERSION.SDK_INT >= 29) {
                    cVar.f9953r = new g(context, mediaSessionCompat$Token);
                } else {
                    cVar.f9953r = new f(context, mediaSessionCompat$Token);
                }
                this.f11365t = cVar;
                if (f11362v == 0) {
                    f11362v = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
}
