package A1;

import F1.l;
import F9.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g extends B9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Class f471f = null;
    public static Constructor g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f472h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f473i = null;
    public static boolean j = false;

    public static boolean f0(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        g0();
        try {
            try {
                return ((Boolean) f472h.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
            } catch (InvocationTargetException e10) {
                e = e10;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e11) {
            e = e11;
        }
    }

    public static void g0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (j) {
            return;
        }
        j = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        g = constructor;
        f471f = cls;
        f472h = method2;
        f473i = method;
    }

    @Override // B9.a
    public Typeface l(Context context, p244z1.d dVar, Resources resources, int i10) throws NoSuchMethodException {
        g0();
        try {
            Object objNewInstance = g.newInstance(null);
            for (p244z1.e eVar : dVar.f24753a) {
                File fileC = n.C(context);
                if (fileC == null) {
                    return null;
                }
                try {
                    if (!n.q(fileC, resources, eVar.f24759f)) {
                        return null;
                    }
                    if (!f0(objNewInstance, fileC.getPath(), eVar.f24755b, eVar.f24756c)) {
                        return null;
                    }
                    fileC.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileC.delete();
                }
            }
            g0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f471f, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f473i.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // B9.a
    public Typeface m(Context context, l[] lVarArr, int i10) {
        File file;
        if (lVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(u(lVarArr, i10).f2176a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceO = o(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceO;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
