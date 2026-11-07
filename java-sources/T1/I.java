package T1;

import A.C0041r0;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC0484a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f7598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f7599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f7600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0041r0 f7601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S9.c f7603f;

    public I(File file, Y y10, M m10, C0041r0 c0041r0) {
        p251z9.j.e(y10, "serializer");
        p251z9.j.e(m10, "coordinator");
        this.f7598a = file;
        this.f7599b = y10;
        this.f7600c = m10;
        this.f7601d = c0041r0;
        this.f7602e = new AtomicBoolean(false);
        this.f7603f = S9.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007a, blocks: (B:34:0x0079, B:43:0x0089, B:42:0x0086, B:39:0x0081), top: B:55:0x001e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [T1.I] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T1.I] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T1.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T1.I] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [T1.o] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object a(C0498o c0498o, q9.c cVar) throws Throwable {
        ?? g;
        D d5;
        Throwable th;
        ?? r10;
        ?? r11;
        if (cVar instanceof G) {
            G g10 = (G) cVar;
            int i10 = g10.f7590w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g10.f7590w = i10 - Integer.MIN_VALUE;
                g = g10;
            } else {
                g = new G(this, cVar);
            }
        } else {
            g = new G(this, cVar);
        }
        Object obj = g.f7588u;
        int i11 = g.f7590w;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0498o = g.f7587t;
                d5 = g.f7586s;
                g = g.f7585r;
                try {
                    p110k9.a.e(obj);
                    r11 = g;
                    r10 = c0498o;
                    try {
                        d5.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        r11.f7603f.b(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        d5.close();
                    } catch (Throwable th4) {
                        p110k9.a.a(th, th4);
                    }
                    throw th;
                }
            }
            p110k9.a.e(obj);
            if (this.f7602e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zG = this.f7603f.g();
            try {
                d5 = new D(this.f7598a, this.f7599b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zG);
                    g.f7585r = this;
                    g.f7586s = d5;
                    g.f7587t = zG;
                    g.f7590w = 1;
                    Object objD = c0498o.d(d5, boolValueOf, g);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objD == aVar) {
                        return aVar;
                    }
                    obj = objD;
                    r10 = zG;
                    r11 = this;
                    d5.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        r11.f7603f.b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    c0498o = zG;
                    g = this;
                    d5.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c0498o = zG;
                g = this;
                if (c0498o != 0) {
                    g.f7603f.b(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0498o != 0) {
                g.f7603f.b(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e0 A[Catch: all -> 0x011b, IOException -> 0x011e, TRY_ENTER, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6 A[Catch: all -> 0x011b, IOException -> 0x011e, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee A[Catch: all -> 0x011b, IOException -> 0x011e, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3 A[Catch: all -> 0x011b, IOException -> 0x011e, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa A[Catch: all -> 0x011b, IOException -> 0x011e, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0127 A[Catch: all -> 0x011b, IOException -> 0x011e, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x011e, all -> 0x011b, blocks: (B:43:0x00e0, B:45:0x00e6, B:47:0x00ee, B:51:0x00fa, B:52:0x011a, B:48:0x00f3, B:59:0x0127, B:66:0x0134, B:65:0x0131, B:62:0x012c), top: B:90:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x013e A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:70:0x0138, B:72:0x013e, B:73:0x0141, B:33:0x009c, B:34:0x00b8), top: B:82:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00fa, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r3v8, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object b(A a9, q9.c cVar) {
        H h7;
        ?? r12;
        I i10;
        p241y9.e eVar;
        K k7;
        Throwable th;
        K k10;
        ?? r10;
        I i11;
        ?? r11;
        File file;
        boolean zRenameTo;
        if (cVar instanceof H) {
            h7 = (H) cVar;
            int i12 = h7.f7597x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                h7.f7597x = i12 - Integer.MIN_VALUE;
            } else {
                h7 = new H(this, cVar);
            }
        } else {
            h7 = new H(this, cVar);
        }
        Object obj = h7.f7595v;
        ?? file2 = h7.f7597x;
        ?? r13 = 2;
        r13 = 2;
        p161p9.a aVar = p161p9.a.f21156r;
        try {
            try {
                try {
                    try {
                        if (file2 == 0) {
                            p110k9.a.e(obj);
                            if (this.f7602e.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file3 = this.f7598a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file3);
                                }
                            }
                            h7.f7591r = this;
                            h7.f7592s = a9;
                            S9.c cVar2 = this.f7603f;
                            h7.f7593t = cVar2;
                            h7.f7597x = 1;
                            if (cVar2.e(h7) != aVar) {
                                i10 = this;
                                eVar = a9;
                                r12 = cVar2;
                            }
                            return aVar;
                        }
                        if (file2 != 1) {
                            if (file2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            k10 = h7.f7594u;
                            file2 = (File) h7.f7593t;
                            r13 = (S9.a) h7.f7592s;
                            i11 = h7.f7591r;
                            try {
                                p110k9.a.e(obj);
                                r11 = file2;
                                r10 = r13;
                                try {
                                    k10.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r11.exists()) {
                                    file = i11.f7598a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = Z6.a.g(r11, file);
                                    } else {
                                        zRenameTo = r11.renameTo(file);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + r11 + " to " + i11.f7598a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                r10.b(null);
                                return p110k9.y.f19095a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    k10.close();
                                } catch (Throwable th4) {
                                    p110k9.a.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        S9.a aVar2 = (S9.a) h7.f7593t;
                        p241y9.e eVar2 = (p241y9.e) h7.f7592s;
                        i10 = h7.f7591r;
                        p110k9.a.e(obj);
                        r12 = aVar2;
                        eVar = eVar2;
                        h7.f7591r = i10;
                        h7.f7592s = r12;
                        h7.f7593t = file2;
                        h7.f7594u = k7;
                        h7.f7597x = 2;
                        if (eVar.invoke(k7, h7) != aVar) {
                            r10 = r12;
                            i11 = i10;
                            k10 = k7;
                            r11 = file2;
                            k10.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r11.exists()) {
                                file = i11.f7598a;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = Z6.a.g(r11, file);
                                } else {
                                    zRenameTo = r11.renameTo(file);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + r11 + " to " + i11.f7598a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            r10.b(null);
                            return p110k9.y.f19095a;
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        r13 = r12;
                        th = th5;
                        k10 = k7;
                        k10.close();
                        throw th;
                    }
                    Y y10 = i10.f7599b;
                    p251z9.j.e(y10, "serializer");
                    k7 = new K(file2, y10);
                } catch (IOException e10) {
                    e = e10;
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw e;
                }
                file2 = new File(i10.f7598a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r12.b(null);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            r12 = r13;
            if (file2.exists()) {
                file2.delete();
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            r12 = r13;
            r12.b(null);
            throw th;
        }
    }

    @Override // T1.InterfaceC0484a
    public final void close() {
        this.f7602e.set(true);
        this.f7601d.invoke();
    }
}
