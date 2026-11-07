package F9;

import A.C0025j;
import A.C0037p;
import A.EnumC0047u0;
import D.InterfaceC0064g;
import F.C0152a;
import F.C0153b;
import F.C0154c;
import F.C0155d;
import F2.C0156a;
import G.AbstractC0190y;
import G.C0174h;
import G.a0;
import G.g0;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.InterfaceC0290m;
import J0.j0;
import J0.y0;
import K0.AbstractC0359n0;
import K0.P;
import K9.InterfaceC0402u;
import R0.s;
import R0.v;
import T1.InterfaceC0491h;
import U0.AbstractC0517i;
import U0.AbstractC0522n;
import U0.C0513e;
import U0.C0515g;
import U0.K;
import Z.C;
import Z.C0672b;
import Z.C0675c0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.G0;
import Z.L0;
import Z.S;
import Z.X;
import Z0.y;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.inputmethod.ExtractedText;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p063g1.p;
import p120l9.r;
import p151p.V;
import p180s0.C1294c;
import p180s0.C1297f;
import p180s0.F;
import p180s0.L;
import p180s0.q;
import p224x0.AbstractC1438b;
import p224x0.C1440d;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p224x0.I;
import p224x0.J;
import p232y.C1452f;
import u.A;
import u.E;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1297f f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1294c f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p196u0.b f2553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1442f f2554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1442f f2555e;

    public static final long A(double d5) {
        return L(4294967296L, (float) d5);
    }

    public static final long B(int i10) {
        return L(4294967296L, i10);
    }

    public static File C(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final boolean D(C0515g c0515g) {
        int length = c0515g.f8060s.length();
        List list = c0515g.f8059r;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0513e c0513e = (C0513e) list.get(i10);
                if ((c0513e.f8054a instanceof AbstractC0522n) && AbstractC0517i.b(0, length, c0513e.f8055b, c0513e.f8056c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean G(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean H(C0156a c0156a, int i10, int i11) {
        p251z9.j.e(c0156a, "<this>");
        if (i10 > i11 && c0156a.f2260l) {
            return false;
        }
        Set set = c0156a.f2261m;
        return c0156a.f2259k && (set == null || !set.contains(Integer.valueOf(i10)));
    }

    public static boolean I(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static final void J(String str) {
        p251z9.j.e(str, "key");
        throw new IllegalArgumentException(p245z2.a.D("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final long L(long j, float f3) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        p[] pVarArr = p063g1.o.f16265b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x035d  */
    /* JADX WARN: Code duplicated, block: B:133:0x035f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0371  */
    /* JADX WARN: Code duplicated, block: B:138:0x0374  */
    /* JADX WARN: Code duplicated, block: B:139:0x0377  */
    /* JADX WARN: Code duplicated, block: B:140:0x037a  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:159:0x0409 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x040b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0413  */
    /* JADX WARN: Code duplicated, block: B:165:0x0423  */
    /* JADX WARN: Code duplicated, block: B:166:0x0426  */
    /* JADX WARN: Code duplicated, block: B:169:0x042c  */
    public static final p215w0.b M(int i10, C0698o c0698o) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        long jC;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        a0 a0VarD;
        int i16;
        Shader shader;
        F l10;
        Shader shader2;
        F l11;
        F f3;
        int i17;
        Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
        c0698o.k(AndroidCompositionLocals_androidKt.f12062a);
        Resources resources = context.getResources();
        P0.d dVar = (P0.d) c0698o.k(AndroidCompositionLocals_androidKt.f12065d);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f6579a.b(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                t tVar = dVar.f6579a;
                int iD = tVar.d(i10);
                Object[] objArr = tVar.f22733c;
                Object obj = objArr[iD];
                tVar.f22732b[iD] = i10;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !H9.o.X0(charSequence, ".xml")) {
            c0698o.T(-802887899);
            boolean zG = c0698o.g(context.getTheme()) | c0698o.g(charSequence) | c0698o.e(i10);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                try {
                    Drawable drawable = resources.getDrawable(i10, null);
                    p251z9.j.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objH = new C1297f(((BitmapDrawable) drawable).getBitmap());
                    c0698o.e0(objH);
                } catch (Exception e10) {
                    throw new A6.a("Error attempting to load resource: " + ((Object) charSequence), e10);
                }
            }
            p215w0.a aVar = new p215w0.a((C1297f) objH);
            c0698o.p(false);
            return aVar;
        }
        c0698o.T(-803043333);
        Resources.Theme theme = context.getTheme();
        int i18 = typedValue.changingConfigurations;
        P0.c cVar = (P0.c) c0698o.k(AndroidCompositionLocals_androidKt.f12064c);
        P0.b bVar = new P0.b(theme, i10);
        WeakReference weakReference = (WeakReference) cVar.f6578a.get(bVar);
        P0.a aVar2 = weakReference != null ? (P0.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i10);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!p251z9.j.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            p233y0.a aVar3 = new p233y0.a(xml);
            TypedArray typedArrayI = p244z1.a.i(resources, theme, attributeSetAsAttributeSet, p233y0.b.f24618a);
            aVar3.b(typedArrayI.getChangingConfigurations());
            boolean z10 = !p244z1.a.f(xml, "autoMirrored") ? false : typedArrayI.getBoolean(5, false);
            aVar3.b(typedArrayI.getChangingConfigurations());
            float fA = aVar3.a(typedArrayI, "viewportWidth", 7, 0.0f);
            float fA2 = aVar3.a(typedArrayI, "viewportHeight", 8, 0.0f);
            if (fA <= 0.0f) {
                throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayI.getDimension(3, 0.0f);
            aVar3.b(typedArrayI.getChangingConfigurations());
            float dimension2 = typedArrayI.getDimension(2, 0.0f);
            aVar3.b(typedArrayI.getChangingConfigurations());
            if (typedArrayI.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayI.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = q.g;
                } else {
                    ColorStateList colorStateListC = p244z1.a.c(typedArrayI, xml, theme);
                    aVar3.b(typedArrayI.getChangingConfigurations());
                    jC = colorStateListC != null ? F.c(colorStateListC.getDefaultColor()) : q.g;
                }
            } else {
                jC = q.g;
            }
            long j = jC;
            int i19 = typedArrayI.getInt(6, -1);
            aVar3.b(typedArrayI.getChangingConfigurations());
            if (i19 == -1) {
                i11 = 5;
            } else if (i19 == 3) {
                i11 = 3;
            } else if (i19 == 5) {
                i11 = 5;
            } else if (i19 != 9) {
                switch (i19) {
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        i11 = 13;
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        i11 = 14;
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        i11 = 12;
                        break;
                    default:
                        i11 = 5;
                        break;
                }
            } else {
                i11 = 9;
            }
            float f7 = dimension / resources.getDisplayMetrics().density;
            float f10 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayI.recycle();
            C1441e c1441e = new C1441e(null, f7, f10, fA, fA2, j, i11, z10, 1);
            int i20 = 0;
            for (int i21 = 3; xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i21); i21 = 3) {
                List listU = r.f19440r;
                XmlPullParser xmlPullParser = aVar3.f24615a;
                V v10 = aVar3.f24617c;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i22 = i20;
                if (eventType != 2) {
                    if (eventType == i21 && "group".equals(xmlPullParser.getName())) {
                        int i23 = i22 + 1;
                        for (int i24 = 0; i24 < i23; i24++) {
                            ArrayList arrayList = c1441e.f24212i;
                            if (c1441e.f24213k) {
                                G0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            C1440d c1440d = (C1440d) arrayList.remove(arrayList.size() - 1);
                            ((C1440d) p123m2.c.q(1, arrayList)).j.add(new p224x0.F(c1440d.f24197a, c1440d.f24198b, c1440d.f24199c, c1440d.f24200d, c1440d.f24201e, c1440d.f24202f, c1440d.g, c1440d.f24203h, c1440d.f24204i, c1440d.j));
                        }
                        i20 = 0;
                    }
                    i20 = i22;
                } else {
                    String name = xmlPullParser.getName();
                    if (name == null) {
                        i20 = i22;
                    } else {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayI2 = p244z1.a.i(resources, theme, attributeSetAsAttributeSet, p233y0.b.f24619b);
                                    aVar3.b(typedArrayI2.getChangingConfigurations());
                                    float fA3 = aVar3.a(typedArrayI2, "rotation", 5, 0.0f);
                                    float f11 = typedArrayI2.getFloat(1, 0.0f);
                                    aVar3.b(typedArrayI2.getChangingConfigurations());
                                    float f12 = typedArrayI2.getFloat(2, 0.0f);
                                    aVar3.b(typedArrayI2.getChangingConfigurations());
                                    float fA4 = aVar3.a(typedArrayI2, "scaleX", 3, 1.0f);
                                    float fA5 = aVar3.a(typedArrayI2, "scaleY", 4, 1.0f);
                                    float fA6 = aVar3.a(typedArrayI2, "translateX", 6, 0.0f);
                                    float fA7 = aVar3.a(typedArrayI2, "translateY", 7, 0.0f);
                                    String string = typedArrayI2.getString(0);
                                    aVar3.b(typedArrayI2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayI2.recycle();
                                    int i25 = G.f24154a;
                                    if (c1441e.f24213k) {
                                        G0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    c1441e.f24212i.add(new C1440d(str, fA3, f11, f12, fA4, fA5, fA6, fA7, listU, 512));
                                    i20 = i22;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayI3 = p244z1.a.i(resources, theme, attributeSetAsAttributeSet, p233y0.b.f24620c);
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = typedArrayI3.getString(0);
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayI3.getString(2);
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i26 = G.f24154a;
                                } else {
                                    listU = V.u(v10, string3);
                                }
                                List list = listU;
                                a0 a0VarD2 = p244z1.a.d(typedArrayI3, aVar3.f24615a, theme, "fillColor", 1);
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                float fA8 = aVar3.a(typedArrayI3, "fillAlpha", 12, 1.0f);
                                int i27 = !p244z1.a.f(aVar3.f24615a, "strokeLineCap") ? -1 : typedArrayI3.getInt(8, -1);
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                if (i27 != 0) {
                                    if (i27 != 1) {
                                        i12 = 2;
                                        if (i27 == 2) {
                                            i13 = 2;
                                        }
                                    } else {
                                        i12 = 2;
                                        i13 = 1;
                                    }
                                    if (p244z1.a.f(aVar3.f24615a, "strokeLineJoin")) {
                                        i14 = typedArrayI3.getInt(9, -1);
                                    } else {
                                        i14 = -1;
                                    }
                                    aVar3.b(typedArrayI3.getChangingConfigurations());
                                    if (i14 != 0) {
                                        i15 = 0;
                                    } else if (i14 != 1) {
                                        i15 = i12;
                                    } else {
                                        i15 = 1;
                                    }
                                    float fA9 = aVar3.a(typedArrayI3, "strokeMiterLimit", 10, 1.0f);
                                    a0VarD = p244z1.a.d(typedArrayI3, aVar3.f24615a, theme, "strokeColor", 3);
                                    aVar3.b(typedArrayI3.getChangingConfigurations());
                                    float fA10 = aVar3.a(typedArrayI3, "strokeAlpha", 11, 1.0f);
                                    float fA11 = aVar3.a(typedArrayI3, "strokeWidth", 4, 1.0f);
                                    float fA12 = aVar3.a(typedArrayI3, "trimPathEnd", 6, 1.0f);
                                    float fA13 = aVar3.a(typedArrayI3, "trimPathOffset", 7, 0.0f);
                                    float fA14 = aVar3.a(typedArrayI3, "trimPathStart", 5, 0.0f);
                                    if (p244z1.a.f(aVar3.f24615a, "fillType")) {
                                        i16 = typedArrayI3.getInt(13, 0);
                                    } else {
                                        i16 = 0;
                                    }
                                    aVar3.b(typedArrayI3.getChangingConfigurations());
                                    typedArrayI3.recycle();
                                    shader = (Shader) a0VarD2.f2655c;
                                    if (shader == null && a0VarD2.f2654b == 0) {
                                        l10 = null;
                                    } else if (shader != null) {
                                        l10 = new p180s0.n(shader);
                                    } else {
                                        l10 = new L(F.c(a0VarD2.f2654b));
                                    }
                                    shader2 = (Shader) a0VarD.f2655c;
                                    if (shader2 != null && a0VarD.f2654b == 0) {
                                        f3 = null;
                                    } else {
                                        if (shader2 != null) {
                                            l11 = new p180s0.n(shader2);
                                        } else {
                                            l11 = new L(F.c(a0VarD.f2654b));
                                        }
                                        f3 = l11;
                                    }
                                    if (i16 == 0) {
                                        i17 = 0;
                                    } else {
                                        i17 = 1;
                                    }
                                    if (c1441e.f24213k) {
                                        G0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((C1440d) p123m2.c.q(1, c1441e.f24212i)).j.add(new J(str2, list, i17, l10, fA8, f3, fA10, fA11, i13, i15, fA9, fA14, fA12, fA13));
                                    i20 = i22;
                                } else {
                                    i12 = 2;
                                }
                                i13 = 0;
                                if (p244z1.a.f(aVar3.f24615a, "strokeLineJoin")) {
                                    i14 = -1;
                                } else {
                                    i14 = typedArrayI3.getInt(9, -1);
                                }
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                if (i14 != 0) {
                                    i15 = 0;
                                } else if (i14 != 1) {
                                    i15 = i12;
                                } else {
                                    i15 = 1;
                                }
                                float fA15 = aVar3.a(typedArrayI3, "strokeMiterLimit", 10, 1.0f);
                                a0VarD = p244z1.a.d(typedArrayI3, aVar3.f24615a, theme, "strokeColor", 3);
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                float fA16 = aVar3.a(typedArrayI3, "strokeAlpha", 11, 1.0f);
                                float fA17 = aVar3.a(typedArrayI3, "strokeWidth", 4, 1.0f);
                                float fA18 = aVar3.a(typedArrayI3, "trimPathEnd", 6, 1.0f);
                                float fA19 = aVar3.a(typedArrayI3, "trimPathOffset", 7, 0.0f);
                                float fA110 = aVar3.a(typedArrayI3, "trimPathStart", 5, 0.0f);
                                if (p244z1.a.f(aVar3.f24615a, "fillType")) {
                                    i16 = 0;
                                } else {
                                    i16 = typedArrayI3.getInt(13, 0);
                                }
                                aVar3.b(typedArrayI3.getChangingConfigurations());
                                typedArrayI3.recycle();
                                shader = (Shader) a0VarD2.f2655c;
                                if (shader == null) {
                                    l10 = null;
                                } else if (shader != null) {
                                    l10 = new p180s0.n(shader);
                                } else {
                                    l10 = new L(F.c(a0VarD2.f2654b));
                                }
                                shader2 = (Shader) a0VarD.f2655c;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        l11 = new p180s0.n(shader2);
                                    } else {
                                        l11 = new L(F.c(a0VarD.f2654b));
                                    }
                                    f3 = l11;
                                } else {
                                    f3 = null;
                                }
                                if (i16 == 0) {
                                    i17 = 0;
                                } else {
                                    i17 = 1;
                                }
                                if (c1441e.f24213k) {
                                    G0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((C1440d) p123m2.c.q(1, c1441e.f24212i)).j.add(new J(str2, list, i17, l10, fA8, f3, fA16, fA17, i13, i15, fA15, fA110, fA18, fA19));
                                i20 = i22;
                            }
                            i20 = i22;
                        } else if (name.equals("clip-path")) {
                            TypedArray typedArrayI4 = p244z1.a.i(resources, theme, attributeSetAsAttributeSet, p233y0.b.f24621d);
                            aVar3.b(typedArrayI4.getChangingConfigurations());
                            String string4 = typedArrayI4.getString(0);
                            aVar3.b(typedArrayI4.getChangingConfigurations());
                            String str3 = string4 == null ? "" : string4;
                            String string5 = typedArrayI4.getString(1);
                            aVar3.b(typedArrayI4.getChangingConfigurations());
                            if (string5 == null) {
                                int i28 = G.f24154a;
                            } else {
                                listU = V.u(v10, string5);
                            }
                            List list2 = listU;
                            typedArrayI4.recycle();
                            if (c1441e.f24213k) {
                                G0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            c1441e.f24212i.add(new C1440d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                            i20 = i22 + 1;
                        } else {
                            i20 = i22;
                        }
                    }
                }
                xmlResourceParser.next();
                xml = xmlResourceParser;
            }
            aVar2 = new P0.a(c1441e.b(), i18);
            cVar.f6578a.put(bVar, new WeakReference(aVar2));
        }
        I iC = AbstractC1438b.c(aVar2.f6574a, c0698o);
        c0698o.p(false);
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x029d  */
    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:169:0x035d  */
    /* JADX WARN: Code duplicated, block: B:173:0x036d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0374  */
    /* JADX WARN: Code duplicated, block: B:178:0x037e A[LOOP:5: B:177:0x037c->B:178:0x037e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:192:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:199:0x0193 A[EDGE_INSN: B:199:0x0193->B:66:0x0193 BREAK  A[LOOP:0: B:9:0x0040->B:64:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x016d A[DONT_INVERT, PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
      0x016d: PHI (r20v6 m0.e) = (r20v5 m0.e), (r20v7 m0.e) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r22v13 T0.a) = (r22v12 T0.a), (r22v14 T0.a) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r23v6 m0.o) = (r23v5 m0.o), (r23v7 m0.o) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r25v11 R0.g) = (r25v10 R0.g), (r25v12 R0.g) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r28v12 U0.g) = (r28v11 U0.g), (r28v13 U0.g) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x016f A[LOOP:0: B:9:0x0040->B:64:0x016f, LOOP_END] */
    public static final void N(ViewStructure viewStructure, J0.I i10, AutofillId autofillId, String str, S0.a aVar) {
        int i11;
        long j;
        long j10;
        long j11;
        char c10;
        T0.a aVar2;
        R0.g gVar;
        C0515g c0515g;
        p122m0.e eVar;
        boolean z10;
        p122m0.o oVar;
        Boolean bool;
        boolean z11;
        Integer num;
        Integer num2;
        List list;
        boolean z12;
        boolean z13;
        String strT;
        int size;
        String strF;
        int i12;
        String[] strArrA;
        String[] strArrA2;
        E e10;
        long[] jArr;
        Object[] objArr;
        Integer num3;
        long[] jArr2;
        Object[] objArr2;
        E e11;
        T0.a aVar3;
        R0.g gVar2;
        C0515g c0515g2;
        int i13;
        Integer num4 = 1;
        v vVar = s.f7156a;
        v vVar2 = R0.i.f7084a;
        R0.j jVarW = i10.w();
        int i14 = 2;
        int i15 = 8;
        if (jVarW == null || (e11 = jVarW.f7108r) == null) {
            i11 = 2;
            j = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
            aVar2 = null;
            gVar = null;
            c0515g = null;
            eVar = null;
            z10 = false;
            oVar = null;
            bool = null;
            z11 = false;
            num = null;
        } else {
            j = 128;
            Object[] objArr3 = e11.f22670b;
            Object[] objArr4 = e11.f22671c;
            long[] jArr3 = e11.f22669a;
            j10 = 255;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i16 = 0;
                eVar = null;
                z10 = false;
                aVar3 = null;
                oVar = null;
                bool = null;
                gVar2 = null;
                z11 = false;
                num = null;
                c0515g2 = null;
                j11 = -9187201950435737472L;
                while (true) {
                    long j12 = jArr3[i16];
                    i11 = i14;
                    c10 = 7;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j12 & 255) < 128) {
                                int i19 = (i16 << 3) + i18;
                                Object obj = objArr3[i19];
                                Object obj2 = objArr4[i19];
                                v vVar3 = (v) obj;
                                i13 = i15;
                                if (p251z9.j.a(vVar3, s.f7170q)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    eVar = (p122m0.e) obj2;
                                } else if (p251z9.j.a(vVar3, s.f7156a)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) p120l9.m.g0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (p251z9.j.a(vVar3, s.f7169p)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    oVar = (p122m0.o) obj2;
                                } else if (p251z9.j.a(vVar3, s.f7146D)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    c0515g2 = (C0515g) obj2;
                                } else if (p251z9.j.a(vVar3, s.f7164k)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (p251z9.j.a(vVar3, s.f7155M)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (p251z9.j.a(vVar3, s.f7151I)) {
                                    z11 = true;
                                } else if (p251z9.j.a(vVar3, s.f7176w)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    gVar2 = (R0.g) obj2;
                                } else if (p251z9.j.a(vVar3, s.f7149G)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (p251z9.j.a(vVar3, s.f7150H)) {
                                    p251z9.j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar3 = (T0.a) obj2;
                                } else if (p251z9.j.a(vVar3, R0.i.f7085b)) {
                                    viewStructure.setClickable(true);
                                } else if (p251z9.j.a(vVar3, R0.i.f7086c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (p251z9.j.a(vVar3, R0.i.f7103v)) {
                                    viewStructure.setFocusable(true);
                                } else if (p251z9.j.a(vVar3, R0.i.j)) {
                                    z10 = true;
                                }
                            } else {
                                i13 = i15;
                            }
                            j12 >>= i13;
                            i18++;
                            i15 = i13;
                        }
                        if (i17 != i15) {
                            break;
                        }
                        if (i16 != length) {
                            break;
                        }
                        i16++;
                        i14 = i11;
                        i15 = 8;
                    } else if (i16 != length) {
                        break;
                        break;
                    } else {
                        i16++;
                        i14 = i11;
                        i15 = 8;
                    }
                }
            } else {
                i11 = 2;
                j11 = -9187201950435737472L;
                c10 = 7;
                eVar = null;
                z10 = false;
                aVar3 = null;
                oVar = null;
                bool = null;
                gVar2 = null;
                z11 = false;
                num = null;
                c0515g2 = null;
            }
            aVar2 = aVar3;
            gVar = gVar2;
            c0515g = c0515g2;
        }
        R0.j jVarW2 = i10.w();
        if (jVarW2 != null && jVarW2.f7110t && !jVarW2.f7111u) {
            jVarW2 = jVarW2.b();
            A a9 = new A(((p011b0.b) i10.o()).f13119r.f13127t);
            a9.b(i10.o());
            while (a9.h()) {
                J0.I i20 = (J0.I) a9.j(a9.f22651b - 1);
                R0.j jVarW3 = i20.w();
                if (jVarW3 != null && !jVarW3.f7110t) {
                    jVarW2.d(jVarW3);
                    if (!jVarW3.f7111u) {
                        a9.b(i20.o());
                    }
                }
            }
        }
        if (jVarW2 == null || (e10 = jVarW2.f7108r) == null) {
            num2 = num4;
            list = null;
        } else {
            Object[] objArr5 = e10.f22670b;
            Object[] objArr6 = e10.f22671c;
            long[] jArr4 = e10.f22669a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                list = null;
                while (true) {
                    long j13 = jArr4[i21];
                    if ((((~j13) << c10) & j13 & j11) != j11) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j13 & j10) < j) {
                                int i24 = (i21 << 3) + i23;
                                Object obj3 = objArr5[i24];
                                num3 = num4;
                                Object obj4 = objArr6[i24];
                                jArr2 = jArr4;
                                v vVar4 = (v) obj3;
                                objArr2 = objArr5;
                                if (p251z9.j.a(vVar4, s.f7163i)) {
                                    viewStructure.setEnabled(false);
                                } else if (p251z9.j.a(vVar4, s.f7179z)) {
                                    p251z9.j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j13 >>= 8;
                            i23++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i22 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i21 == length2) {
                        break;
                    }
                    i21++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num4 = num2;
                }
            } else {
                num2 = num4;
                list = null;
            }
        }
        Integer numValueOf = Integer.valueOf(i10.f3926s);
        if (i10.u() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        p122m0.h.c(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = (eVar == null && !z10) ? aVar2 != null ? Integer.valueOf(i11) : null : num2;
        if (numValueOf2 != null) {
            p122m0.h.d(viewStructure, numValueOf2.intValue());
        }
        if (oVar != null && (strArrA2 = B9.a.A(oVar)) != null) {
            p122m0.h.b(viewStructure, strArrA2);
        }
        aVar.f7456a.n(i10.f3926s, new F.f(i11, viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar2 != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(aVar2 == T0.a.f7551r);
        } else if (bool != null && (gVar == null || gVar.f7079a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        p122m0.o.f19476a.getClass();
        String[] strArrA3 = B9.a.A(p122m0.n.f19475b);
        p251z9.j.e(strArrA3, "<this>");
        if (strArrA3.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        String str2 = strArrA3[0];
        if (oVar != null && (strArrA = B9.a.A(oVar)) != null) {
            boolean zT = p120l9.l.T(str2, strArrA);
            z12 = true;
            boolean z14 = zT;
            if (!z11 || z14) {
                z13 = z12;
            } else {
                z13 = false;
            }
            if (z13) {
                p122m0.h.f(viewStructure);
            }
            viewStructure.setVisibility(((j0) i10.f3914W.f4065d).M0() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strF = "";
                for (i12 = 0; i12 < size; i12++) {
                    strF = p245z2.a.F(android.support.v4.media.session.p.C(strF), ((C0515g) list.get(i12)).f8060s, '\n');
                }
                viewStructure.setText(strF);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((p011b0.b) i10.o()).isEmpty() && gVar != null && (strT = P.t(gVar.f7079a)) != null) {
                viewStructure.setClassName(strT);
            }
            if (z10) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    B1.a.p(viewStructure, num.intValue());
                }
                if (c0515g != null) {
                    p122m0.h.e(viewStructure, p122m0.h.a(c0515g.f8060s));
                }
                if (z13) {
                    p122m0.h.g(viewStructure);
                }
            }
        }
        z12 = true;
        if (z11) {
            z13 = z12;
        } else {
            z13 = z12;
        }
        if (z13) {
            p122m0.h.f(viewStructure);
        }
        viewStructure.setVisibility(((j0) i10.f3914W.f4065d).M0() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strF = "";
            while (i12 < size) {
                strF = p245z2.a.F(android.support.v4.media.session.p.C(strF), ((C0515g) list.get(i12)).f8060s, '\n');
            }
            viewStructure.setText(strF);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((p011b0.b) i10.o()).isEmpty()) {
            viewStructure.setClassName(strT);
        }
        if (z10) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                B1.a.p(viewStructure, num.intValue());
            }
            if (c0515g != null) {
                p122m0.h.e(viewStructure, p122m0.h.a(c0515g.f8060s));
            }
            if (z13) {
                p122m0.h.g(viewStructure);
            }
        }
    }

    public static final ExtractedText U(y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f10953a.f8060s;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = yVar.f10954b;
        extractedText.selectionStart = K.e(j);
        extractedText.selectionEnd = K.d(j);
        extractedText.flags = !H9.o.U0(yVar.f10953a.f8060s, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String V(byte b5) {
        char[] cArr = Ea.b.f2005a;
        return new String(new char[]{cArr[(b5 >> 4) & 15], cArr[b5 & 15]});
    }

    public static final String W(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = Ea.b.f2005a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        p017b7.g.O(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }

    public static int X(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long Y(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX WARN: Code duplicated, block: B:155:0x025d  */
    /* JADX WARN: Code duplicated, block: B:165:0x027b  */
    public static final void a(int i10, int i11, C0037p c0037p, InterfaceC0064g interfaceC0064g, D.P p10, F.A a9, C0698o c0698o, l0.d dVar, l0.r rVar, C1452f c1452f, p241y9.c cVar, boolean z10) {
        int i12;
        int i13;
        F.A a10;
        boolean z11;
        boolean z12;
        Object nVar;
        F.A a11;
        int i14;
        boolean z13;
        d dVar2;
        l0.r rVarA;
        c0698o.V(924924659);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o.g(a9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o.g(p10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.h(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.h(true) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o.g(c0037p) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0698o.h(z10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0698o.g(c1452f) ? 8388608 : 4194304;
        }
        int i15 = i12 | 100663296;
        if ((i10 & 805306368) == 0) {
            i15 |= c0698o.g(dVar) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0698o.g(interfaceC0064g) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i17 = i13 | 432;
        if ((i11 & 3072) == 0) {
            i17 |= c0698o.i(cVar) ? 2048 : 1024;
        }
        if (c0698o.K(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 1171) == 1170) ? false : true)) {
            int i18 = (i16 >> 3) & 14;
            int i19 = i18 | ((i17 >> 6) & 112);
            X xU = C0672b.u(cVar, c0698o);
            boolean z14 = (((i19 & 14) ^ 6) > 4 && c0698o.g(a9)) || (i19 & 6) == 4;
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (z14 || objH == obj) {
                C0153b c0153b = new C0153b();
                c0153b.f2042a = new C0675c0(Integer.MAX_VALUE);
                c0153b.f2043b = new C0675c0(Integer.MAX_VALUE);
                S s10 = S.f10641u;
                F.k kVar = new F.k(xU, 0);
                p074h0.i iVar = G0.f10597a;
                objH = new F.j(0, 0, L0.class, new C(new C0025j(new C(kVar, s10), a9, c0153b, 1), s10), "value", "getValue()Ljava/lang/Object;");
                c0698o.e0(objH);
            }
            d dVar3 = (d) objH;
            int i20 = i16 >> 9;
            int i21 = i18 | (i20 & 112);
            boolean z15 = ((((i21 & 14) ^ 6) > 4 && c0698o.g(a9)) || (i21 & 6) == 4) | ((((i21 & 112) ^ 48) > 32 && c0698o.h(true)) || (i21 & 48) == 32);
            Object objH2 = c0698o.H();
            if (z15 || objH2 == obj) {
                objH2 = new C0154c(a9);
                c0698o.e0(objH2);
            }
            C0154c c0154c = (C0154c) objH2;
            Object objH3 = c0698o.H();
            if (objH3 == obj) {
                objH3 = C0672b.m(c0698o);
                c0698o.e0(objH3);
            }
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH3;
            p180s0.v vVar = (p180s0.v) c0698o.k(AbstractC0359n0.g);
            C0174h c0174h = !((Boolean) c0698o.k(AbstractC0359n0.f5131v)).booleanValue() ? g0.f2697a : null;
            int i22 = i17 << 18;
            int i23 = (i16 & 65520) | (i20 & 458752) | (i20 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i17 << 27) & 1879048192);
            boolean z16 = ((((i23 & 112) ^ 48) > 32 && c0698o.g(a9)) || (i23 & 48) == 32) | ((((i23 & 896) ^ 384) > 256 && c0698o.g(p10)) || (i23 & 384) == 256);
            if (((i23 & 7168) ^ 3072) > 2048 && c0698o.h(false)) {
                z11 = true;
            } else if ((i23 & 3072) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z16 | z11;
            if (((57344 & i23) ^ 24576) > 16384 && c0698o.h(true)) {
                z12 = true;
            } else if ((i23 & 24576) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zG = (((i23 & 234881024) ^ 100663296) > 67108864 && c0698o.g(null)) | z17 | z12 | ((((i23 & 3670016) ^ 1572864) > 1048576 && c0698o.g(dVar)) || (i23 & 1572864) == 1048576) | (((i23 & 29360128) ^ 12582912) > 8388608 && c0698o.g(null)) | ((((i23 & 1879048192) ^ 805306368) > 536870912 && c0698o.g(interfaceC0064g)) || (i23 & 805306368) == 536870912) | c0698o.g(vVar) | c0698o.g(c0174h);
            Object objH4 = c0698o.H();
            if (zG || objH4 == obj) {
                a11 = a9;
                i14 = 32;
                z13 = true;
                nVar = new F.n(a11, p10, dVar3, interfaceC0064g, interfaceC0402u, vVar, c0174h, dVar);
                dVar2 = dVar3;
                c0698o.e0(nVar);
            } else {
                nVar = objH4;
                dVar2 = dVar3;
                i14 = 32;
                z13 = true;
                a11 = a9;
            }
            p241y9.e eVar = (p241y9.e) nVar;
            EnumC0047u0 enumC0047u0 = EnumC0047u0.f424r;
            if (z10) {
                c0698o.T(-1513147781);
                int i24 = i18 | ((i16 >> 21) & 112);
                boolean z18 = ((((i24 & 14) ^ 6) <= 4 || !c0698o.g(a11)) && (i24 & 6) != 4) ? false : z13;
                if (((i24 & 112) ^ 48) <= i14 || !c0698o.e(0)) {
                    z13 = false;
                }
                boolean z19 = z18 | z13;
                Object objH5 = c0698o.H();
                if (z19 || objH5 == obj) {
                    objH5 = new C0155d(a11);
                    c0698o.e0(objH5);
                }
                rVarA = androidx.compose.foundation.lazy.layout.a.a((C0155d) objH5, a11.f2020n, enumC0047u0);
                c0698o.p(false);
            } else {
                c0698o.T(-1512720880);
                c0698o.p(false);
                rVarA = l0.o.f19333a;
            }
            a10 = a11;
            AbstractC0190y.a(dVar2, androidx.compose.foundation.a.h(androidx.compose.foundation.lazy.layout.a.b(rVar.b(a11.f2017k).b(a11.f2018l), dVar2, c0154c, enumC0047u0, z10).b(rVarA).b(a11.f2019m.f11854k), a11, enumC0047u0, z10, c0037p, a11.f2014f, false, c1452f), a10.f2021o, eVar, c0698o, 0);
        } else {
            a10 = a9;
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0152a(rVar, a10, p10, c0037p, z10, c1452f, dVar, interfaceC0064g, cVar, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final R0.p b(J0.I i10, boolean z10) {
        l0.q qVar = (l0.q) i10.f3914W.f4067f;
        InterfaceC0290m interfaceC0290m = null;
        if ((qVar.f19342u & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.f19341t & 8) == 0) {
                    if ((qVar.f19342u & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.f19344w;
                } else {
                    l0.q qVarF = qVar;
                    p011b0.e eVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof y0) {
                            interfaceC0290m = qVarF;
                            break loop0;
                        }
                        if ((qVarF.f19341t & 8) != 0 && (qVarF instanceof AbstractC0291n)) {
                            int i11 = 0;
                            for (l0.q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                if ((qVar2.f19341t & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        qVarF = qVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new p011b0.e(new l0.q[16]);
                                        }
                                        if (qVarF != null) {
                                            eVar.b(qVarF);
                                            qVarF = null;
                                        }
                                        eVar.b(qVar2);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        qVarF = AbstractC0283f.f(eVar);
                    }
                    if ((qVar.f19342u & 8) != 0) {
                        break;
                    }
                    qVar = qVar.f19344w;
                }
            }
        }
        p251z9.j.b(interfaceC0290m);
        l0.q qVar3 = ((l0.q) ((y0) interfaceC0290m)).f19339r;
        R0.j jVarW = i10.w();
        if (jVarW == null) {
            jVarW = new R0.j();
        }
        return new R0.p(qVar3, z10, i10, jVarW);
    }

    public static final RippleContainer c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    public static final ViewGroup d(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    public static final String e(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        G9.i iVarB0 = G9.k.b0(type, m.f2550z);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) G9.k.d0(iVarB0)).getName());
        Iterator it = iVarB0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        sb.append(H9.v.O0(i10, "[]"));
        return sb.toString();
    }

    public static final boolean f(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        p251z9.j.e(bArr, "a");
        p251z9.j.e(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void j(long j) {
        p[] pVarArr = p063g1.o.f16265b;
        if ((j & 1095216660480L) == 0) {
            p063g1.i.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static void k(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static void l(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void m(long j, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j || j - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static void n(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbW = p123m2.c.w(i10, "radix ", " was not in valid range ");
            sbW.append(new E9.d(2, 36, 1));
            throw new IllegalArgumentException(sbW.toString());
        }
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Type p(p251z9.A a9, boolean z10) {
        p251z9.e eVar = a9.f24859a;
        Class clsE = z10 ? p171r0.a.e(eVar) : p171r0.a.d(eVar);
        List list = a9.f24860b;
        if (list.isEmpty()) {
            return clsE;
        }
        if (!clsE.isArray()) {
            return s(clsE, list);
        }
        if (clsE.getComponentType().isPrimitive()) {
            return clsE;
        }
        h hVar = (h) (list.size() == 1 ? list.get(0) : null);
        if (hVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + a9);
        }
        i iVar = hVar.f2541a;
        p251z9.A a10 = hVar.f2542b;
        int i10 = iVar == null ? -1 : l.f2549a[iVar.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsE;
        }
        if (i10 != 2 && i10 != 3) {
            throw new A6.a();
        }
        p251z9.j.b(a10);
        Type typeP = p(a10, false);
        return typeP instanceof Class ? clsE : new a(typeP);
    }

    public static boolean q(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zR = r(file, inputStreamOpenRawResource);
                o(inputStreamOpenRawResource);
                return zR;
            } catch (Throwable th) {
                th = th;
                o(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean r(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            o(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final k s(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(p120l9.n.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(y((h) it.next()));
            }
            return new k(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(p120l9.n.a0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(y((h) it2.next()));
            }
            return new k(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        k kVarS = s(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(p120l9.n.a0(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(y((h) it3.next()));
        }
        return new k(cls, kVarS, arrayList3);
    }

    public static final Object t(InterfaceC0491h interfaceC0491h, p241y9.e eVar, p150o9.c cVar) {
        return interfaceC0491h.a(new X1.c(eVar, null, 1), cVar);
    }

    public static final boolean u(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static Application v(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static void w(p039d8.b bVar) {
        boolean z10 = false;
        if (!bVar.isDone()) {
            throw new IllegalStateException(AbstractC0813f2.J("Future was expected to be done: %s", bVar));
        }
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static Set x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final Type y(h hVar) {
        i iVar = hVar.f2541a;
        if (iVar == null) {
            return o.f2556t;
        }
        p251z9.A a9 = hVar.f2542b;
        p251z9.j.b(a9);
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            return p(a9, true);
        }
        if (iOrdinal == 1) {
            return new o(null, p(a9, true));
        }
        if (iOrdinal == 2) {
            return new o(p(a9, true), null);
        }
        throw new A6.a();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c A[LOOP:0: B:4:0x000d->B:37:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x006f A[EDGE_INSN: B:42:0x006f->B:38:0x006f BREAK  A[LOOP:0: B:4:0x000d->B:37:0x006c], SYNTHETIC] */
    public static final y0 z(J0.I i10) {
        l0.q qVar = (l0.q) i10.f3914W.f4067f;
        Object obj = null;
        if ((qVar.f19342u & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.f19341t & 8) == 0) {
                    if ((qVar.f19342u & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.f19344w;
                } else {
                    l0.q qVarF = qVar;
                    p011b0.e eVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof y0) {
                            if (((y0) qVarF).V()) {
                                obj = qVarF;
                                break loop0;
                            }
                        } else if ((qVarF.f19341t & 8) != 0 && (qVarF instanceof AbstractC0291n)) {
                            int i11 = 0;
                            for (l0.q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                if ((qVar2.f19341t & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        qVarF = qVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new p011b0.e(new l0.q[16]);
                                        }
                                        if (qVarF != null) {
                                            eVar.b(qVarF);
                                            qVarF = null;
                                        }
                                        eVar.b(qVar2);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        qVarF = AbstractC0283f.f(eVar);
                    }
                    if ((qVar.f19342u & 8) != 0) {
                        break;
                    }
                    qVar = qVar.f19344w;
                }
            }
        }
        return (y0) obj;
    }

    public abstract void E(int i10);

    public abstract boolean F();

    public abstract void O(p112l1.g gVar, p112l1.g gVar2);

    public abstract void P(p112l1.g gVar, Thread thread);

    public abstract void R(boolean z10);

    public abstract void S();

    public abstract void T(int i10);

    public abstract boolean g(p112l1.h hVar, p112l1.d dVar, p112l1.d dVar2);

    public abstract boolean h(p112l1.h hVar, Object obj, Object obj2);

    public abstract boolean i(p112l1.h hVar, p112l1.g gVar, p112l1.g gVar2);

    public void Q(boolean z10) {
    }
}
