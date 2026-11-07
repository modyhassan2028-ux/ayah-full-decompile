package T1;

import A.C0039q;
import K9.AbstractC0405x;
import N9.C0412e;
import N9.InterfaceC0415h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public final class U implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p150o9.h f7635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f7636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0412e f7637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7640f;
    public final S9.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110k9.o f7641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110k9.o f7642i;

    public U(p150o9.h hVar, File file) {
        p251z9.j.e(hVar, "context");
        p251z9.j.e(file, "file");
        this.f7635a = hVar;
        this.f7636b = file;
        Object obj = V.f7643b;
        this.f7637c = new C0412e(new C0039q(file, (p150o9.c) null, 25), p150o9.i.f20380r, -2, M9.a.f5830r);
        this.f7638d = ".lock";
        this.f7639e = ".version";
        this.f7640f = "fcntl failed: EAGAIN";
        this.g = S9.d.a();
        this.f7641h = p110k9.a.d(new Q(this, 2));
        this.f7642i = p110k9.a.d(new Q(this, 1));
    }

    public static final void f(U u8, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T1.T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    @Override // T1.M
    public final Object a(p241y9.e eVar, q9.c cVar) throws Throwable {
        ?? t2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        S9.c cVar2;
        boolean z10;
        FileInputStream fileInputStream;
        S9.c cVar3;
        boolean z11;
        ?? r10 = eVar;
        if (cVar instanceof T) {
            T t10 = (T) cVar;
            int i10 = t10.f7634x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t10.f7634x = i10 - Integer.MIN_VALUE;
                t2 = t10;
            } else {
                t2 = new T(this, cVar);
            }
        } else {
            t2 = new T(this, cVar);
        }
        Object objInvoke = t2.f7632v;
        int i11 = t2.f7634x;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        z11 = t2.f7631u;
                        cVar3 = t2.f7628r;
                        p110k9.a.e(objInvoke);
                        if (z11) {
                            cVar3.b(null);
                        }
                        return objInvoke;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = t2.f7631u;
                    fileLock = t2.f7630t;
                    fileInputStream = t2.f7629s;
                    cVar2 = t2.f7628r;
                    try {
                        p110k9.a.e(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        p181s2.o.e(fileInputStream, null);
                        if (z10) {
                            cVar2.b(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                p110k9.a.e(objInvoke);
                S9.c cVar4 = this.g;
                boolean zG = cVar4.g();
                p161p9.a aVar = p161p9.a.f21156r;
                try {
                    if (zG) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f7641h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e10) {
                                String message2 = e10.getMessage();
                                if ((message2 == null || !H9.v.R0(message2, this.f7640f, false)) && ((message = e10.getMessage()) == null || !H9.v.R0(message, "Resource deadlock would occur", false))) {
                                    throw e10;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                t2.f7628r = cVar4;
                                t2.f7629s = fileInputStream2;
                                t2.f7630t = fileLockTryLock;
                                t2.f7631u = zG;
                                t2.f7634x = 2;
                                objInvoke = r10.invoke(boolValueOf, t2);
                                if (objInvoke != aVar) {
                                    cVar2 = cVar4;
                                    z10 = zG;
                                    fileInputStream = fileInputStream2;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    p181s2.o.e(fileInputStream, null);
                                    if (z10) {
                                        cVar2.b(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        t2.f7628r = cVar4;
                        t2.f7631u = zG;
                        t2.f7634x = 1;
                        objInvoke = r10.invoke(bool, t2);
                        if (objInvoke != aVar) {
                            cVar3 = cVar4;
                            z11 = zG;
                            if (z11) {
                                cVar3.b(null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    t2 = cVar4;
                    r10 = zG;
                    if (r10 != 0) {
                        t2.b(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                ?? r11 = t2;
                try {
                    throw th5;
                } catch (Throwable th6) {
                    try {
                        p181s2.o.e(2, th5);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        r10 = r10;
                        t2 = r11;
                        if (r10 != 0) {
                            t2.b(null);
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba A[Catch: all -> 0x00be, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00be, blocks: (B:42:0x00ba, B:56:0x00d7, B:57:0x00da), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #7 {all -> 0x00be, blocks: (B:42:0x00ba, B:56:0x00d7, B:57:0x00da), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [S9.a] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    @Override // T1.M
    public final Object b(p241y9.c cVar, q9.c cVar2) throws Throwable {
        S s10;
        U u8;
        FileOutputStream fileOutputStream;
        Throwable th;
        p241y9.c cVar3;
        ?? r10;
        ?? r11;
        FileLock fileLock;
        Closeable closeable;
        FileLock fileLock2;
        Object objE;
        ?? r12;
        ?? r13;
        Closeable closeable2;
        if (cVar2 instanceof S) {
            s10 = (S) cVar2;
            int i10 = s10.f7627w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                s10.f7627w = i10 - Integer.MIN_VALUE;
            } else {
                s10 = new S(this, cVar2);
            }
        } else {
            s10 = new S(this, cVar2);
        }
        ?? r14 = s10.f7625u;
        ?? r15 = s10.f7627w;
        p161p9.a aVar = p161p9.a.f21156r;
        try {
            try {
                try {
                    if (r15 == 0) {
                        p110k9.a.e(r14);
                        s10.f7622r = this;
                        s10.f7623s = cVar;
                        S9.c cVar4 = this.g;
                        s10.f7624t = cVar4;
                        s10.f7627w = 1;
                        if (cVar4.e(s10) != aVar) {
                            u8 = this;
                            r14 = cVar4;
                        }
                        return aVar;
                    }
                    if (r15 != 1) {
                        if (r15 != 2) {
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) s10.f7624t;
                            Closeable closeable3 = (Closeable) s10.f7623s;
                            S9.a aVar2 = (S9.a) s10.f7622r;
                            try {
                                p110k9.a.e(r14);
                                r12 = aVar2;
                                closeable2 = closeable3;
                                r13 = r14;
                                if (fileLock != null) {
                                    closeable2 = closeable;
                                    fileLock.release();
                                }
                                try {
                                    closeable2 = closeable;
                                    p181s2.o.e(closeable2, null);
                                    r12.b(null);
                                    return r13;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r14 = r12;
                                    r14.b(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        Closeable closeable4 = (Closeable) s10.f7624t;
                        r10 = (S9.a) s10.f7623s;
                        cVar3 = (p241y9.c) s10.f7622r;
                        try {
                            p110k9.a.e(r14);
                            closeable = closeable4;
                            r10 = r10;
                            r11 = r14;
                            fileLock2 = (FileLock) r11;
                            try {
                                s10.f7622r = r10;
                                s10.f7623s = closeable;
                                s10.f7624t = fileLock2;
                                s10.f7627w = 3;
                                objE = cVar3.e(s10);
                                if (objE != aVar) {
                                    r12 = r10;
                                    fileLock = fileLock2;
                                    r13 = objE;
                                    if (fileLock != null) {
                                        closeable2 = closeable;
                                        fileLock.release();
                                    }
                                    closeable2 = closeable;
                                    p181s2.o.e(closeable2, null);
                                    r12.b(null);
                                    return r13;
                                }
                                return aVar;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    S9.a aVar3 = (S9.a) s10.f7624t;
                    p241y9.c cVar5 = (p241y9.c) s10.f7623s;
                    u8 = (U) s10.f7622r;
                    p110k9.a.e(r14);
                    r14 = aVar3;
                    cVar = cVar5;
                    s10.f7622r = cVar;
                    s10.f7623s = r14;
                    s10.f7624t = fileOutputStream;
                    s10.f7627w = 2;
                    Object objA = g0.a(fileOutputStream, s10);
                    if (objA != aVar) {
                        cVar3 = cVar;
                        r10 = r14;
                        r11 = objA;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r11;
                        s10.f7622r = r10;
                        s10.f7623s = closeable;
                        s10.f7624t = fileLock2;
                        s10.f7627w = 3;
                        objE = cVar3.e(s10);
                        if (objE != aVar) {
                            r12 = r10;
                            fileLock = fileLock2;
                            r13 = objE;
                            if (fileLock != null) {
                                closeable2 = closeable;
                                fileLock.release();
                            }
                            closeable2 = closeable;
                            p181s2.o.e(closeable2, null);
                            r12.b(null);
                            return r13;
                        }
                    }
                    return aVar;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream((File) u8.f7641h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r14.b(null);
                throw th;
            }
        } catch (Throwable th8) {
            r14 = s10;
            try {
                throw th8;
            } catch (Throwable th9) {
                p181s2.o.e(r15, th8);
                throw th9;
            }
        }
    }

    @Override // T1.M
    public final InterfaceC0415h c() {
        return this.f7637c;
    }

    @Override // T1.M
    public final Object d(A a9) {
        p110k9.o oVar = this.f7642i;
        if (oVar.a()) {
            return new Integer(Z.f7652b.nativeIncrementAndGetCounterValue(((Z) oVar.getValue()).f7653a));
        }
        return AbstractC0405x.I(this.f7635a, new P(this, null, 1), a9);
    }

    @Override // T1.M
    public final Object e(q9.c cVar) {
        p110k9.o oVar = this.f7642i;
        if (oVar.a()) {
            return new Integer(Z.f7652b.nativeGetCounterValue(((Z) oVar.getValue()).f7653a));
        }
        return AbstractC0405x.I(this.f7635a, new P(this, null, 0), cVar);
    }
}
