package p213v8;

import D6.s;
import F1.b;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p160p8.h;
import p160p8.j;
import p185s8.K0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f23370e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23371f = 15;
    public static final p194t8.a g = new p194t8.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f23372h = new b(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f23373i = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f23374a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f23375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f23376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f23377d;

    public a(b bVar, s sVar, j jVar) {
        this.f23375b = bVar;
        this.f23376c = sVar;
        this.f23377d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f23370e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f23370e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f23375b;
        arrayList.addAll(b.e(((File) bVar.f23383f).listFiles()));
        arrayList.addAll(b.e(((File) bVar.g).listFiles()));
        b bVar2 = f23372h;
        Collections.sort(arrayList, bVar2);
        List listE = b.e(((File) bVar.f23382e).listFiles());
        Collections.sort(listE, bVar2);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(((File) this.f23375b.f23381d).list())).descendingSet();
    }

    public final void d(K0 k7, String str, boolean z10) {
        b bVar = this.f23375b;
        int i10 = this.f23376c.b().f24391a.f13208r;
        g.getClass();
        try {
            f(bVar.b(str, p245z2.a.D("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f23374a.getAndIncrement())), z10 ? "_" : "")), p194t8.a.f22646a.D(k7));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        h hVar = new h(3);
        bVar.getClass();
        File file = new File((File) bVar.f23381d, str);
        file.mkdirs();
        List<File> listE = b.e(file.listFiles(hVar));
        Collections.sort(listE, new b(8));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i10) {
                return;
            }
            b.d(file2);
            size--;
        }
    }
}
