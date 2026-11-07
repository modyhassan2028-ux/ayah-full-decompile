package p244z1;

import F1.g;
import G.a0;
import M.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f24746a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f24747b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f24748c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f24749d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f24750e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f24751f;
    public static boolean g;

    public static int b(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!f(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i10 >= 28 && i10 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = b.f24752a;
        try {
            return b.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    public static a0 d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        a0 a0VarD;
        if (f(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new a0((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                a0VarD = a0.d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                a0VarD = null;
            }
            if (a0VarD != null) {
                return a0VarD;
            }
        }
        return new a0((Shader) null, (ColorStateList) null, 0);
    }

    public static String e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (f(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int g(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f7 = (f3 + 16.0f) / 116.0f;
        float f10 = f3 > 8.0f ? f7 * f7 * f7 : f3 / 903.2963f;
        float f11 = f7 * f7 * f7;
        boolean z10 = f11 > 0.008856452f;
        float f12 = z10 ? f11 : ((f7 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f11 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f24748c;
        return A1.a.a(f12 * fArr[0], f10 * fArr[1], f11 * fArr[2]);
    }

    public static float h(int i10) {
        float f3 = i10 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static c l(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            o(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p206v1.a.f23093b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                o(xmlResourceParser);
            }
            List listM = m(resources, resourceId);
            return new f(new g(string, string2, string3, listM), string4 != null ? new g(string, string2, string4, listM) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p206v1.a.f23094c);
                    int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                    int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i13);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        o(xmlResourceParser);
                    }
                    arrayList.add(new e(i10, i12, resourceId2, string7, string6, z10));
                } else {
                    o(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    public static List m(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void n(Resources.Theme theme) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29) {
            i.a(theme);
            return;
        }
        synchronized (f24750e) {
            if (g) {
                method = f24751f;
                if (method != null) {
                    method.invoke(theme, null);
                }
            } else {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f24751f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                }
                g = true;
                method = f24751f;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                        f24751f = null;
                    }
                }
            }
            throw th;
        }
    }

    public static void o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static float p() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i10) {
        new Handler(Looper.getMainLooper()).post(new d(i10, 3, this));
    }

    public abstract void j(int i10);

    public abstract void k(Typeface typeface);
}
