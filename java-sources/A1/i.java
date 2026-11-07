package A1;

import F1.l;
import F9.n;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Constructor f478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f483q;

    public i() throws NoSuchMethodException {
        Method methodL0;
        Constructor<?> constructor;
        Method methodK0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodK0 = k0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodL0 = l0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodL0 = null;
            constructor = null;
            methodK0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f477k = cls;
        this.f478l = constructor;
        this.f479m = methodK0;
        this.f480n = method;
        this.f481o = method2;
        this.f482p = method3;
        this.f483q = methodL0;
    }

    public static Method k0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean h0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f479m.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f477k, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f483q.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j0(Object obj) {
        try {
            return ((Boolean) this.f481o.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // A1.g, B9.a
    public final Typeface l(Context context, p244z1.d dVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f479m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, dVar, resources, i10);
        }
        try {
            objNewInstance = this.f478l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            p244z1.e[] eVarArr = dVar.f24753a;
            int length = eVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                p244z1.e eVar = eVarArr[i11];
                Context context2 = context;
                if (h0(context2, objNewInstance, eVar.f24754a, eVar.f24758e, eVar.f24755b, eVar.f24756c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.f24757d))) {
                    i11++;
                    context = context2;
                } else {
                    try {
                        this.f482p.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (j0(objNewInstance)) {
                return i0(objNewInstance);
            }
        }
        return null;
    }

    public Method l0(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    @Override // A1.g, B9.a
    public final Typeface m(Context context, l[] lVarArr, int i10) throws IOException {
        Object objNewInstance;
        Typeface typefaceI0;
        char c10;
        boolean zBooleanValue;
        char c11 = 1;
        if (lVarArr.length >= 1) {
            Method method = this.f479m;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (l lVar : lVarArr) {
                        if (lVar.f2180e == 0) {
                            Uri uri = lVar.f2176a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, n.K(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f478l.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = lVarArr.length;
                        int i11 = 0;
                        char c12 = 0;
                        while (true) {
                            Method method2 = this.f482p;
                            if (i11 >= length) {
                                if (c12 != 0) {
                                    if (!j0(objNewInstance) || (typefaceI0 = i0(objNewInstance)) == null) {
                                        break;
                                        break;
                                    }
                                    return Typeface.create(typefaceI0, i10);
                                }
                                method2.invoke(objNewInstance, null);
                                break;
                            }
                            l lVar2 = lVarArr[i11];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lVar2.f2176a);
                            if (byteBuffer == null) {
                                c10 = c11;
                            } else {
                                int i12 = lVar2.f2177b;
                                int i13 = lVar2.f2178c;
                                boolean z10 = lVar2.f2179d;
                                try {
                                    Method method3 = this.f480n;
                                    Integer numValueOf = Integer.valueOf(i12);
                                    Integer numValueOf2 = Integer.valueOf(i13);
                                    Integer numValueOf3 = Integer.valueOf(z10 ? 1 : 0);
                                    c10 = c11;
                                    try {
                                        Object[] objArr = new Object[5];
                                        objArr[0] = byteBuffer;
                                        objArr[c10] = numValueOf;
                                        objArr[2] = null;
                                        objArr[3] = numValueOf2;
                                        objArr[4] = numValueOf3;
                                        zBooleanValue = ((Boolean) method3.invoke(objNewInstance, objArr)).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    c10 = c11;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                c12 = c10;
                            }
                            i11++;
                            c11 = c10;
                        }
                    }
                } else {
                    l lVarU = u(lVarArr, i10);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lVarU.f2176a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lVarU.f2178c).setItalic(lVarU.f2179d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    @Override // B9.a
    public final Typeface p(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f479m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.p(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f478l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!h0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f482p.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (j0(objNewInstance)) {
                return i0(objNewInstance);
            }
        }
        return null;
    }
}
