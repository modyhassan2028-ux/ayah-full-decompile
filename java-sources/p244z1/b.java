package p244z1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.ayah.R;
import java.io.IOException;
import java.lang.reflect.Array;
import m1.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p206v1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f24752a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f3;
        int iG;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = a.f23092a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i10, i10);
                int resourceId = ObtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f24752a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i10, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i10, -65281);
                }
                if (ObtainAttributes.hasValue(r10)) {
                    f3 = ObtainAttributes.getFloat(r10, 1.0f);
                } else {
                    f3 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r10;
                float f7 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i13 = i10;
                int i14 = i13;
                while (i13 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i15 = i14 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i14] = attributeNameResource;
                        i14 = i15;
                    }
                    i13++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i14);
                float f10 = 100.0f;
                boolean z10 = (f7 < 0.0f || f7 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f3 != 1.0f || z10) {
                    int i16 = B9.a.i((int) ((Color.alpha(color) * f3) + 0.5f), 0, 255);
                    if (z10) {
                        h hVarB = h.b(color);
                        float f11 = hVarB.f19516a;
                        float f12 = hVarB.f19517b;
                        k kVar = k.f24773k;
                        if (f12 >= 1.0d && Math.round(f7) > 0.0d && Math.round(f7) < 100.0d) {
                            float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                            float f13 = 0.0f;
                            float f14 = f12;
                            boolean z11 = r16 == true ? 1 : 0;
                            h hVar = null;
                            while (true) {
                                if (Math.abs(f13 - f12) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (hVar != null) {
                                        iG = hVar.d(kVar);
                                        break;
                                    }
                                    iG = a.g(f7);
                                    break;
                                }
                                float f15 = 1000.0f;
                                float f16 = f10;
                                float f17 = 0.0f;
                                float f18 = 1000.0f;
                                h hVar2 = null;
                                while (true) {
                                    if (Math.abs(f17 - f16) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f10 = f10;
                                        break;
                                    }
                                    f10 = f10;
                                    float f19 = ((f16 - f17) / 2.0f) + f17;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iD = h.c(f19, f14, fMin).d(k.f24773k);
                                    float fH = a.h(Color.red(iD));
                                    float fH2 = a.h(Color.green(iD));
                                    float fH3 = a.h(Color.blue(iD));
                                    float[] fArr = a.f24749d[r16 == true ? 1 : 0];
                                    float f20 = ((fH3 * fArr[2]) + ((fH2 * fArr[r16 == true ? 1 : 0]) + (fH * fArr[0]))) / f10;
                                    float fCbrt = f20 <= 0.008856452f ? f20 * 903.2963f : (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f7 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        h hVarB2 = h.b(iD);
                                        h hVarC = h.c(hVarB2.f19518c, hVarB2.f19517b, fMin);
                                        float f21 = hVarB2.f19519d - hVarC.f19519d;
                                        float f22 = hVarB2.f19520e - hVarC.f19520e;
                                        float f23 = hVarB2.f19521f - hVarC.f19521f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f18 = fPow;
                                            f15 = fAbs;
                                            hVar2 = hVarB2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f15 == 0.0f && f18 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f7) {
                                        f17 = f19;
                                    } else {
                                        f16 = f19;
                                    }
                                    f10 = f10;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                h hVar3 = hVar2;
                                if (!z11) {
                                    if (hVar3 == null) {
                                        f12 = f14;
                                    } else {
                                        hVar = hVar3;
                                        f13 = f14;
                                    }
                                    f14 = ((f12 - f13) / 2.0f) + f13;
                                } else {
                                    if (hVar3 != null) {
                                        iG = hVar3.d(kVar);
                                        break;
                                    }
                                    f14 = ((f12 - f13) / 2.0f) + f13;
                                    z11 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iG = a.g(f7);
                        }
                        color = iG;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i16 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i17 = i11 + 1;
                if (i17 > iArr.length) {
                    int[] iArr4 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i11);
                    iArr = iArr4;
                }
                iArr[i11] = color;
                if (i17 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i11 = i17;
                r10 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i10 = 0;
            } else {
                int i18 = depth2;
                r10 = r10 == true ? 1 : 0;
                depth2 = i18;
                i10 = 0;
            }
        }
        int[] iArr5 = new int[i11];
        int[][] iArr6 = new int[i11][];
        System.arraycopy(iArr, 0, iArr5, 0, i11);
        System.arraycopy(objArr, 0, iArr6, 0, i11);
        return new ColorStateList(iArr6, iArr5);
    }
}
