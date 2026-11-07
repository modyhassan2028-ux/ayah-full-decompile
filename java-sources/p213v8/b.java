package p213v8;

import Ca.r;
import K0.RunnableC0354l;
import android.content.Context;
import android.util.Log;
import com.squareup.moshi.z;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p160p8.g;
import p170q8.c;
import p178r8.e;
import p178r8.h;
import p185s8.C1307a0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f23378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f23383f;
    public Object g;

    public b() {
        this.f23378a = new AtomicBoolean();
        this.f23379b = null;
        this.f23380c = new HashMap(16, 1.0f);
        this.f23381d = new HashMap(16, 1.0f);
        this.f23382e = new HashMap(16, 1.0f);
        this.f23383f = new HashMap(16, 1.0f);
        this.g = null;
    }

    public static synchronized void c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f23379b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f23381d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void f(String str) {
        r rVar = (r) this.f23382e;
        synchronized (rVar) {
            try {
                if (((e) ((AtomicMarkableReference) rVar.f849c).getReference()).c(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) rVar.f849c;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                    RunnableC0354l runnableC0354l = new RunnableC0354l(21, rVar);
                    AtomicReference atomicReference = (AtomicReference) rVar.f850d;
                    while (!atomicReference.compareAndSet(null, runnableC0354l)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((c) ((b) rVar.f851e).f23380c).f21346b.a(runnableC0354l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(Context context) {
        String string;
        String strReplaceAll;
        String str = ((C1307a0) m8.c.f19691a.b(context)).f22301a;
        this.f23378a = str;
        File filesDir = context.getFilesDir();
        this.f23379b = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = g.h(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(strReplaceAll);
            string = sb.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        c(file);
        this.f23380c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f23381d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f23382e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f23383f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.g = file5;
    }

    public b(String str, b bVar, c cVar) {
        this.f23381d = new r(this, false);
        this.f23382e = new r(this, true);
        this.f23383f = new z(2);
        this.g = new AtomicMarkableReference(null, false);
        this.f23378a = str;
        this.f23379b = new h(bVar);
        this.f23380c = cVar;
    }
}
