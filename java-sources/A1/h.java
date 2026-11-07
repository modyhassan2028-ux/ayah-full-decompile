package A1;

import F1.l;
import F9.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class h extends B9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class f474f;
    public static final Constructor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Method f476i;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        g = constructor;
        f474f = cls;
        f475h = method2;
        f476i = method;
    }

    public static boolean f0(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f475h.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f474f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f476i.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // B9.a
    public final Typeface l(Context context, p244z1.d dVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (p244z1.e eVar : dVar.f24753a) {
                int i11 = eVar.f24759f;
                File fileC = n.C(context);
                if (fileC != null) {
                    try {
                        if (n.q(fileC, resources, i11)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileC);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileC.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileC.delete();
                        }
                        if (map != null && f0(objNewInstance, map, eVar.f24758e, eVar.f24755b, eVar.f24756c)) {
                        }
                    } catch (Throwable th3) {
                        fileC.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return g0(objNewInstance);
        }
        return null;
    }

    @Override // B9.a
    public final Typeface m(Context context, l[] lVarArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            O o10 = new O(0);
            for (l lVar : lVarArr) {
                Uri uri = lVar.f2176a;
                ByteBuffer byteBufferK = (ByteBuffer) o10.get(uri);
                if (byteBufferK == null) {
                    byteBufferK = n.K(context, uri);
                    o10.put(uri, byteBufferK);
                }
                if (byteBufferK != null && f0(objNewInstance, byteBufferK, lVar.f2177b, lVar.f2178c, lVar.f2179d)) {
                }
            }
            Typeface typefaceG0 = g0(objNewInstance);
            if (typefaceG0 != null) {
                return Typeface.create(typefaceG0, i10);
            }
        }
        return null;
    }
}
