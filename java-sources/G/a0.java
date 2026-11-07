package G;

import K0.C0347h0;
import K0.c1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p151p.AbstractC1249j0;
import p151p.C1273w;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2656d;

    public /* synthetic */ a0(int i10, byte b5) {
        this.f2653a = i10;
    }

    public static a0 d(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f3;
        float f7;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = p244z1.b.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new a0((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayI = p244z1.a.i(resources, theme, attributeSetAsAttributeSet, p206v1.a.f23095d);
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayI.getFloat(8, 0.0f) : 0.0f;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayI.getFloat(9, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayI.getFloat(10, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayI.getFloat(11, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayI.getFloat(3, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayI.getFloat(4, 0.0f) : 0.0f;
        int i11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayI.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayI.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayI.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayI.getColor(1, 0) : 0;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayI.getInt(6, 0) : 0;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayI.getFloat(5, 0.0f) : 0.0f;
        typedArrayI.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f17 = f16;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f3 = f12;
            if (next2 == 1) {
                f7 = f13;
                break;
            }
            int depth2 = xml.getDepth();
            f7 = f13;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayI2 = p244z1.a.i(resources, theme, attributeSetAsAttributeSet, p206v1.a.f23096e);
                boolean zHasValue = typedArrayI2.hasValue(0);
                boolean zHasValue2 = typedArrayI2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayI2.getColor(0, 0);
                float f18 = typedArrayI2.getFloat(1, 0.0f);
                typedArrayI2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f18));
            }
            f12 = f3;
            f13 = f7;
        }
        C0347h0 c0347h0 = arrayList2.size() > 0 ? new C0347h0(arrayList2, arrayList) : null;
        if (c0347h0 == null) {
            c0347h0 = z10 ? new C0347h0(color, color2, color3) : new C0347h0(color, color3);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                int[] iArr = c0347h0.f5076a;
                float[] fArr = c0347h0.f5077b;
                if (i12 != 1) {
                    tileMode2 = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f10, f11, f3, f7, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f14, f15, c0347h0.f5076a, c0347h0.f5077b);
            }
        } else {
            if (f17 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = c0347h0.f5076a;
            float[] fArr2 = c0347h0.f5077b;
            if (i12 != 1) {
                tileMode = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f14, f15, f17, iArr2, fArr2, tileMode);
        }
        return new a0(radialGradient, (ColorStateList) null, 0);
    }

    public static void h(a0 a0Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        long[] jArr = (long[]) a0Var.f2655c;
        int i16 = a0Var.f2654b;
        int i17 = i16 + 3;
        a0Var.f2654b = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            a0Var.f2655c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) a0Var.f2656d, iMax);
            p251z9.j.d(jArrCopyOf2, "copyOf(...)");
            a0Var.f2656d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) a0Var.f2655c;
        jArr2[i16] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        jArr2[i16 + 1] = (((long) i14) & 4294967295L) | (((long) i13) << 32);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = (((long) 0) << 63) | (((long) 0) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i18) << 26) | ((long) (i10 & 67108863));
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j = jArr2[i20];
            if ((((int) j) & 67108863) == i18) {
                jArr2[i20] = (j & (-2301339409586323457L)) | (((long) ((i16 - i19) & 511)) << 52);
                return;
            }
        }
    }

    public void a(int i10, android.support.v4.media.session.r rVar) {
        if (i10 < 0) {
            C.a.a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        C0175i c0175i = new C0175i(this.f2654b, i10, rVar);
        this.f2654b += i10;
        ((p011b0.e) this.f2655c).b(c0175i);
    }

    public void b() {
        ka.h hVar;
        ImageView imageView = (ImageView) this.f2655c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1249j0.a(drawable);
        }
        if (drawable == null || (hVar = (ka.h) this.f2656d) == null) {
            return;
        }
        C1273w.e(drawable, hVar, imageView.getDrawableState());
    }

    public p029c8.n c() {
        p029c8.e eVar = (p029c8.e) this.f2656d;
        if (eVar != null) {
            throw eVar.a();
        }
        p029c8.n nVarA = p029c8.n.a(this.f2654b, (Object[]) this.f2655c, this);
        p029c8.e eVar2 = (p029c8.e) this.f2656d;
        if (eVar2 == null) {
            return nVarA;
        }
        throw eVar2.a();
    }

    public C0175i e(int i10) {
        if (i10 < 0 || i10 >= this.f2654b) {
            StringBuilder sbW = p123m2.c.w(i10, "Index ", ", size ");
            sbW.append(this.f2654b);
            C.a.d(sbW.toString());
        }
        C0175i c0175i = (C0175i) this.f2656d;
        if (c0175i != null) {
            int i11 = c0175i.f2700a;
            if (i10 < c0175i.f2701b + i11 && i11 <= i10) {
                return c0175i;
            }
        }
        p011b0.e eVar = (p011b0.e) this.f2655c;
        C0175i c0175i2 = (C0175i) eVar.f13125r[AbstractC0190y.e(i10, eVar)];
        this.f2656d = c0175i2;
        return c0175i2;
    }

    public int f(Object obj) {
        u.z zVar = (u.z) this.f2655c;
        int iD = zVar.d(obj);
        if (iD >= 0) {
            return zVar.f22786c[iD];
        }
        return -1;
    }

    public String g() {
        StringBuilder sb = new StringBuilder("$");
        int i10 = this.f2654b + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f2655c)[i11];
            if (obj instanceof W9.f) {
                W9.f fVar = (W9.f) obj;
                if (!p251z9.j.a(fVar.c(), W9.i.f9680d)) {
                    int i12 = ((int[]) this.f2656d)[i11];
                    if (i12 >= 0) {
                        sb.append(".");
                        sb.append(fVar.e(i12));
                    }
                } else if (((int[]) this.f2656d)[i11] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f2656d)[i11]);
                    sb.append("]");
                }
            } else if (obj != p009aa.j.f11244a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return ((Shader) this.f2655c) == null && (colorStateList = (ColorStateList) this.f2656d) != null && colorStateList.isStateful();
    }

    public void j(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2655c;
        Context context = imageView.getContext();
        int[] iArr = p073h.a.g;
        p074h0.i iVarB = p074h0.i.B(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        I1.S.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = Y2.a.E(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1249j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(iVarB.q(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1249j0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            iVarB.C();
        }
    }

    public void k(Object obj, Object obj2) {
        int i10 = (this.f2654b + 1) * 2;
        Object[] objArr = (Object[]) this.f2655c;
        if (i10 > objArr.length) {
            this.f2655c = Arrays.copyOf(objArr, p000a.a.D(objArr.length, i10));
        }
        F9.n.k(obj, obj2);
        Object[] objArr2 = (Object[]) this.f2655c;
        int i11 = this.f2654b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f2654b = i11 + 1;
    }

    public void l(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f2654b) * 2;
            Object[] objArr = (Object[]) this.f2655c;
            if (size > objArr.length) {
                this.f2655c = Arrays.copyOf(objArr, p000a.a.D(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            k(entry.getKey(), entry.getValue());
        }
    }

    public void m(int i10) {
        ImageView imageView = (ImageView) this.f2655c;
        if (i10 != 0) {
            Drawable drawableE = Y2.a.E(imageView.getContext(), i10);
            if (drawableE != null) {
                AbstractC1249j0.a(drawableE);
            }
            imageView.setImageDrawable(drawableE);
        } else {
            imageView.setImageDrawable(null);
        }
        b();
    }

    public void n(int i10, p241y9.g gVar) {
        int i11 = i10 & 67108863;
        long[] jArr = (long[]) this.f2655c;
        int i12 = this.f2654b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j = jArr[i13];
                long j10 = jArr[i13 + 1];
                gVar.i(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
                return;
            }
        }
    }

    public String toString() {
        switch (this.f2653a) {
            case 4:
                return g();
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((ka.s) this.f2655c) == ka.s.f19247t) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f2654b);
                sb.append(' ');
                sb.append((String) this.f2656d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a0(ka.s sVar, int i10, String str) {
        this.f2653a = 8;
        this.f2655c = sVar;
        this.f2654b = i10;
        this.f2656d = str;
    }

    public a0(ImageView imageView) {
        this.f2653a = 7;
        this.f2654b = 0;
        this.f2655c = imageView;
    }

    public a0(E9.d dVar, F.h hVar) {
        this.f2653a = 1;
        a0 a0Var = hVar.f2052a;
        int i10 = dVar.f1995r;
        if (i10 < 0) {
            C.a.c("negative nearestRange.first");
        }
        int iMin = Math.min(dVar.f1996s, a0Var.f2654b - 1);
        if (iMin < i10) {
            u.z zVar = u.J.f22695a;
            p251z9.j.c(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f2655c = zVar;
            this.f2656d = new Object[0];
            this.f2654b = 0;
            return;
        }
        int i11 = (iMin - i10) + 1;
        this.f2656d = new Object[i11];
        this.f2654b = i10;
        u.z zVar2 = new u.z(i11);
        b0 b0Var = new b0(i10, iMin, zVar2, this);
        p011b0.e eVar = (p011b0.e) a0Var.f2655c;
        if (i10 < 0 || i10 >= a0Var.f2654b) {
            StringBuilder sbW = p123m2.c.w(i10, "Index ", ", size ");
            sbW.append(a0Var.f2654b);
            C.a.d(sbW.toString());
        }
        if (iMin < 0 || iMin >= a0Var.f2654b) {
            StringBuilder sbW2 = p123m2.c.w(iMin, "Index ", ", size ");
            sbW2.append(a0Var.f2654b);
            C.a.d(sbW2.toString());
        }
        if (iMin < i10) {
            C.a.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        int iE = AbstractC0190y.e(i10, eVar);
        int i12 = ((C0175i) eVar.f13125r[iE]).f2700a;
        while (i12 <= iMin) {
            C0175i c0175i = (C0175i) eVar.f13125r[iE];
            b0Var.e(c0175i);
            i12 += c0175i.f2701b;
            iE++;
        }
        this.f2655c = zVar2;
    }

    public a0(Shader shader, ColorStateList colorStateList, int i10) {
        this.f2653a = 9;
        this.f2655c = shader;
        this.f2656d = colorStateList;
        this.f2654b = i10;
    }

    public a0() {
        this.f2653a = 0;
        this.f2655c = new p011b0.e(new C0175i[16]);
    }

    public a0(c1 c1Var) {
        this.f2653a = 2;
        this.f2655c = c1Var;
    }

    public a0(int i10) {
        this.f2653a = 5;
        this.f2655c = new Object[i10 * 2];
        this.f2654b = 0;
    }
}
