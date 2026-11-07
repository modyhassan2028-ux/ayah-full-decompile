package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DateFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.UserManager;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.PointerIcon;
import android.view.inputmethod.EditorInfo;
import j$.util.stream.IntStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public abstract class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b8.b f14062a;

    public static IntStream a(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    public static IntStream b(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static Context c(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList d(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static DecimalFormatSymbols e(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList f(Configuration configuration) {
        return configuration.getLocales();
    }

    public static PointerIcon g(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static String h(long j) {
        if (Build.VERSION.SDK_INT < 24) {
            return DateUtils.formatDateTime(null, j, 8228);
        }
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = com.google.android.material.datepicker.q.f14904a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton.format(new Date(j));
    }

    public static boolean i(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean j(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void k(EditorInfo editorInfo, p012b1.c cVar) {
        if (p251z9.j.a(cVar, p012b1.c.f13144t)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(p120l9.n.a0(cVar, 10));
        Iterator it = cVar.f13145r.iterator();
        while (it.hasNext()) {
            arrayList.add(((p012b1.b) it.next()).f13143a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public static void l(p022c1.d dVar, p012b1.c cVar) {
        ArrayList arrayList = new ArrayList(p120l9.n.a0(cVar, 10));
        Iterator it = cVar.f13145r.iterator();
        while (it.hasNext()) {
            arrayList.add(((p012b1.b) it.next()).f13143a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:77:0x017d, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0046, B:27:0x004e, B:76:0x0179, B:78:0x0180, B:79:0x0183, B:80:0x0184, B:28:0x0052, B:30:0x0056, B:31:0x0063, B:33:0x0069, B:39:0x007f, B:41:0x0085, B:42:0x0091, B:63:0x015d, B:64:0x0160, B:72:0x0170, B:71:0x016d, B:73:0x0171, B:74:0x0176, B:75:0x0177, B:34:0x006f, B:38:0x0076), top: B:88:0x0007, inners: #1 }] */
    public static b8.b m(Context context) {
        b8.b bVar;
        b8.b cVar;
        b8.b cVar2;
        char c10;
        b8.b bVar2 = f14062a;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (K1.class) {
            try {
                bVar = f14062a;
                if (bVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C1350e c1350e = N1.f14077a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        bVar = b8.a.f13327r;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = (!D1.a() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c11 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                cVar = file.exists() ? new b8.c(file) : b8.a.f13327r;
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                cVar = b8.a.f13327r;
                            }
                            if (cVar.b()) {
                                File file2 = (File) cVar.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        u.O o10 = new u.O(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c11]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                u.O o11 = (u.O) o10.get(str3);
                                                if (o11 == null) {
                                                    c10 = 0;
                                                    o11 = new u.O(0);
                                                    o10.put(str3, o11);
                                                } else {
                                                    c10 = 0;
                                                }
                                                o11.put(strDecode, strDecode2);
                                                c11 = c10;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        H1 h7 = new H1(o10);
                                        bufferedReader.close();
                                        cVar2 = new b8.c(h7);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                cVar2 = b8.a.f13327r;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            bVar = cVar2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        bVar = b8.a.f13327r;
                    }
                    f14062a = bVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return bVar;
    }
}
