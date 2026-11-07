package X2;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import io.realm.CollectionUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9853a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f9854b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f9855c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9856d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f9857e = {R.attr.drawable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f9858f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f9859h = {R.attr.ordering};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f9860i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f9861k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code duplicated, block: B:198:0x037b  */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) throws XmlPullParserException, IOException {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i16;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorD;
        int depth = xmlPullParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i17 = 3;
            int i18 = 0;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i19 = 1;
            if (next == 1) {
                break;
            }
            int i20 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    animatorD = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorD = d(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        if (name.equals(CollectionUtils.SET_TYPE)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayI = p244z1.a.i(resources2, theme2, attributeSet, f9859h);
                            a(context, resources2, theme2, r12, attributeSet, animatorSet2, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null ? typedArrayI.getInt(0, 0) : 0);
                            animator = animatorSet2;
                            typedArrayI.recycle();
                            i11 = depth;
                            animator2 = animator;
                        } else {
                            String str2 = "propertyValuesHolder";
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlPullParser.getEventType();
                                if (eventType == i17 || eventType == i19) {
                                    break;
                                }
                                if (eventType != i20) {
                                    xmlPullParser.next();
                                } else {
                                    if (xmlPullParser.getName().equals(str2)) {
                                        TypedArray typedArrayI2 = p244z1.a.i(resources2, theme2, attributeSetAsAttributeSet, f9860i);
                                        String strE = p244z1.a.e(typedArrayI2, xmlPullParser, "propertyName", i17);
                                        int i21 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayI2.getInt(i20, 4) : 4;
                                        int i22 = i21;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlPullParser.next();
                                            i13 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlPullParser.getName().equals("keyframe")) {
                                                int[] iArr = j;
                                                if (i22 == 4) {
                                                    TypedArray typedArrayI3 = p244z1.a.i(resources2, theme2, Xml.asAttributeSet(xmlPullParser), iArr);
                                                    TypedValue typedValuePeekValue = !p244z1.a.f(xmlPullParser, "value") ? null : typedArrayI3.peekValue(0);
                                                    int i23 = (typedValuePeekValue == null || !c(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayI3.recycle();
                                                    i22 = i23;
                                                }
                                                TypedArray typedArrayI4 = p244z1.a.i(resources2, theme2, Xml.asAttributeSet(xmlPullParser), iArr);
                                                float f3 = p244z1.a.f(xmlPullParser, "fraction") ? typedArrayI4.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !p244z1.a.f(xmlPullParser, "value") ? null : typedArrayI4.peekValue(0);
                                                boolean z10 = typedValuePeekValue2 != null;
                                                int i24 = i22 == 4 ? (z10 && c(typedValuePeekValue2.type)) ? 3 : 0 : i22;
                                                if (!z10) {
                                                    keyframeOfFloat = i24 == 0 ? Keyframe.ofFloat(f3) : Keyframe.ofInt(f3);
                                                } else if (i24 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f3, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayI4.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i24 == 1 || i24 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f3, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayI4.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayI4.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayI4.recycle();
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(keyframeOfFloat);
                                                }
                                                xmlPullParser.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i13;
                                            str2 = str2;
                                        }
                                        str = str2;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            i15 = 3;
                                            propertyValuesHolderB = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            int i25 = size;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    i25++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i25++;
                                                }
                                            }
                                            int i26 = i25;
                                            Keyframe[] keyframeArr = new Keyframe[i26];
                                            arrayList3.toArray(keyframeArr);
                                            int i27 = 0;
                                            while (i27 < i26) {
                                                Keyframe keyframe3 = keyframeArr[i27];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i16 = i26;
                                                } else if (i27 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                    i16 = i26;
                                                } else {
                                                    int i28 = i26 - 1;
                                                    if (i27 == i28) {
                                                        keyframe3.setFraction(1.0f);
                                                        i16 = i26;
                                                    } else {
                                                        int i29 = i27;
                                                        for (int i30 = i27 + 1; i30 < i28 && keyframeArr[i30].getFraction() < 0.0f; i30++) {
                                                            i29 = i30;
                                                        }
                                                        float fraction3 = (keyframeArr[i29 + 1].getFraction() - keyframeArr[i27 - 1].getFraction()) / ((i29 - i27) + 2);
                                                        int i31 = i27;
                                                        while (i31 <= i29) {
                                                            float f7 = fraction3;
                                                            keyframeArr[i31].setFraction(keyframeArr[i31 - 1].getFraction() + f7);
                                                            i31++;
                                                            i26 = i26;
                                                            fraction3 = f7;
                                                        }
                                                        i16 = i26;
                                                    }
                                                }
                                                i27++;
                                                i26 = i16;
                                            }
                                            propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(strE, keyframeArr);
                                            i15 = 3;
                                            if (i22 == 3) {
                                                propertyValuesHolderB.setEvaluator(f.f9875a);
                                            }
                                        }
                                        i14 = 0;
                                        i12 = 1;
                                        if (propertyValuesHolderB == null) {
                                            propertyValuesHolderB = b(typedArrayI2, i21, 0, 1, strE);
                                        }
                                        if (propertyValuesHolderB != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolderB);
                                        }
                                        typedArrayI2.recycle();
                                    } else {
                                        i12 = i19;
                                        i13 = depth;
                                        i14 = i18;
                                        str = str2;
                                        i15 = i17;
                                    }
                                    xmlPullParser.next();
                                    resources2 = resources;
                                    i18 = i14;
                                    i19 = i12;
                                    i17 = i15;
                                    i20 = i20;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth = i13;
                                    str2 = str;
                                    theme2 = theme;
                                }
                            }
                            int i32 = i19;
                            i11 = depth;
                            int i33 = i18;
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i34 = i33; i34 < size2; i34++) {
                                    propertyValuesHolderArr[i34] = (PropertyValuesHolder) arrayList2.get(i34);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            i18 = i32;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet != null && i18 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator2);
                    }
                    depth = i11;
                }
                animator = animatorD;
                i11 = depth;
                animator2 = animator;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator2);
                }
                depth = i11;
            }
        }
        int i35 = 0;
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size3 = arrayList.size();
            int i36 = 0;
            while (i35 < size3) {
                Object obj = arrayList.get(i35);
                i35++;
                animatorArr[i36] = (Animator) obj;
                i36++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        int i15 = 2;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            A1.e[] eVarArrU = B0.c.u(string);
            A1.e[] eVarArrU2 = B0.c.u(string2);
            if (eVarArrU != null || eVarArrU2 != null) {
                if (eVarArrU != null) {
                    F7.p pVar = new F7.p(i15);
                    if (eVarArrU2 == null) {
                        return PropertyValuesHolder.ofObject(str, pVar, eVarArrU);
                    }
                    if (B0.c.f(eVarArrU, eVarArrU2)) {
                        return PropertyValuesHolder.ofObject(str, pVar, eVarArrU, eVarArrU2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (eVarArrU2 != null) {
                    return PropertyValuesHolder.ofObject(str, new F7.p(i15), eVarArrU2);
                }
            }
            return null;
        }
        f fVar = i10 == 3 ? f.f9875a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            if (i13 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z11) {
            if (i14 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && fVar != null) {
            propertyValuesHolderOfInt.setEvaluator(fVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        int i10;
        ValueAnimator valueAnimator;
        TypedArray typedArrayI = p244z1.a.i(resources, theme, attributeSet, g);
        TypedArray typedArrayI2 = p244z1.a.i(resources, theme, attributeSet, f9861k);
        ValueAnimator valueAnimator2 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j10 = p244z1.a.f(xmlPullParser, "duration") ? typedArrayI.getInt(1, 300) : 300;
        long j11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayI.getInt(2, 0) : 0;
        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayI.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue typedValuePeekValue = typedArrayI.peekValue(5);
                boolean z10 = typedValuePeekValue != null;
                int i12 = z10 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayI.peekValue(6);
                boolean z11 = typedValuePeekValue2 != null;
                i11 = ((z10 && c(i12)) || (z11 && c(z11 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayI, i11, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator2.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator2.setDuration(j10);
        valueAnimator2.setStartDelay(j11);
        valueAnimator2.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayI.getInt(3, 0) : 0);
        valueAnimator2.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayI.getInt(4, 1) : 1);
        if (typedArrayI2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator2;
            String strE = p244z1.a.e(typedArrayI2, xmlPullParser, "pathData", 1);
            if (strE != null) {
                String strE2 = p244z1.a.e(typedArrayI2, xmlPullParser, "propertyXName", 2);
                String strE3 = p244z1.a.e(typedArrayI2, xmlPullParser, "propertyYName", 3);
                if (i11 != 2) {
                }
                if (strE2 == null && strE3 == null) {
                    throw new InflateException(typedArrayI2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathV = B0.c.v(strE);
                PathMeasure pathMeasure = new PathMeasure(pathV, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathV, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f3 = length / (iMin - 1);
                int i13 = 0;
                float f7 = 0.0f;
                int i14 = 0;
                while (true) {
                    if (i13 >= iMin) {
                        break;
                    }
                    int i15 = iMin;
                    pathMeasure2.getPosTan(f7 - ((Float) arrayList.get(i14)).floatValue(), fArr3, null);
                    fArr[i13] = fArr3[0];
                    fArr2[i13] = fArr3[1];
                    int i16 = i14 + 1;
                    f7 += f3;
                    if (i16 < arrayList.size() && f7 > ((Float) arrayList.get(i16)).floatValue()) {
                        pathMeasure2.nextContour();
                        i14 = i16;
                    }
                    i13++;
                    iMin = i15;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strE2 != null ? PropertyValuesHolder.ofFloat(strE2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strE3 != null ? PropertyValuesHolder.ofFloat(strE3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                i10 = 0;
            } else {
                i10 = 0;
                objectAnimator2.setPropertyName(p244z1.a.e(typedArrayI2, xmlPullParser, "propertyName", 0));
            }
        } else {
            i10 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayI.getResourceId(i10, i10) : i10;
        if (resourceId > 0) {
            valueAnimator = valueAnimator2;
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator = valueAnimator2;
        }
        typedArrayI.recycle();
        if (typedArrayI2 != null) {
            typedArrayI2.recycle();
        }
        return valueAnimator;
    }
}
