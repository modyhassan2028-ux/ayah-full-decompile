package T1;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class D implements InterfaceC0484a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f7576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f7577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7578c;

    public D(File file, Y y10) {
        p251z9.j.e(y10, "serializer");
        this.f7576a = file;
        this.f7577b = y10;
        this.f7578c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [T1.D] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [T1.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [T1.D] */
    public static Object a(D d5, q9.c cVar) {
        C c10;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof C) {
            c10 = (C) cVar;
            int i10 = c10.f7575v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10.f7575v = i10 - Integer.MIN_VALUE;
            } else {
                c10 = new C(d5, cVar);
            }
        } else {
            c10 = new C(d5, cVar);
        }
        Object obj = c10.f7573t;
        ?? r10 = c10.f7575v;
        p161p9.a aVar = p161p9.a.f21156r;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    fileInputStream = c10.f7572s;
                    r10 = (D) c10.f7571r;
                    try {
                        p110k9.a.e(obj);
                        p181s2.o.e(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            p181s2.o.e(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) c10.f7571r;
                try {
                    p110k9.a.e(obj);
                    p181s2.o.e(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        p181s2.o.e(closeable, th);
                        throw th6;
                    }
                }
            }
            p110k9.a.e(obj);
            if (d5.f7578c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(d5.f7576a);
                try {
                    Y y10 = d5.f7577b;
                    c10.f7571r = d5;
                    c10.f7572s = fileInputStream2;
                    c10.f7575v = 1;
                    Object objC = y10.c(fileInputStream2);
                    if (objC != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = objC;
                        p181s2.o.e(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r10 = d5;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                File file = d5.f7576a;
                Y y11 = d5.f7577b;
                if (!file.exists()) {
                    return y11.a();
                }
                FileInputStream fileInputStream3 = new FileInputStream(d5.f7576a);
                try {
                    c10.f7571r = fileInputStream3;
                    c10.f7572s = null;
                    c10.f7575v = 2;
                    Object objC2 = y11.c(fileInputStream3);
                    if (objC2 != aVar) {
                        obj = objC2;
                        closeable = fileInputStream3;
                        p181s2.o.e(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            d5 = r10;
        }
    }

    @Override // T1.InterfaceC0484a
    public final void close() {
        this.f7578c.set(true);
    }
}
