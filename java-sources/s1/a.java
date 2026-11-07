package s1;

import W.AbstractC0607v1;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import io.realm.CollectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21858f;
    public int g;

    public a(a aVar, Object obj) {
        this.f21853a = aVar.f21853a;
        this.f21854b = aVar.f21854b;
        h(obj);
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void e(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22041e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i10 = 0;
        Object string2 = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 1) {
                string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            string2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            string2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else if (index == 6) {
                                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                i10 = 1;
                            } else if (index == 8) {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i12;
            }
        }
        if (string != null && string2 != null) {
            a aVar = new a();
            aVar.f21853a = string;
            aVar.f21854b = i10;
            aVar.h(string2);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void f(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String strS = p123m2.c.s(CollectionUtils.SET_TYPE, str);
            try {
                int iB = AbstractC0607v1.b(aVar.f21854b);
                Class<?> cls2 = Integer.TYPE;
                Class<?> cls3 = Float.TYPE;
                switch (iB) {
                    case 0:
                        cls.getMethod(strS, cls2).invoke(view, Integer.valueOf(aVar.f21855c));
                        break;
                    case 1:
                        cls.getMethod(strS, cls3).invoke(view, Float.valueOf(aVar.f21856d));
                        break;
                    case 2:
                        cls.getMethod(strS, cls2).invoke(view, Integer.valueOf(aVar.g));
                        break;
                    case 3:
                        Method method = cls.getMethod(strS, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strS, CharSequence.class).invoke(view, aVar.f21857e);
                        break;
                    case 5:
                        cls.getMethod(strS, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f21858f));
                        break;
                    case 6:
                        cls.getMethod(strS, cls3).invoke(view, Float.valueOf(aVar.f21856d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbD = android.support.v4.media.session.p.D(" Custom Attribute \"", str, "\" not found on ");
                sbD.append(cls.getName());
                Log.e("TransitionLayout", sbD.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strS);
            } catch (InvocationTargetException e12) {
                StringBuilder sbD2 = android.support.v4.media.session.p.D(" Custom Attribute \"", str, "\" not found on ");
                sbD2.append(cls.getName());
                Log.e("TransitionLayout", sbD2.toString());
                e12.printStackTrace();
            }
        }
    }

    public final float b() {
        switch (AbstractC0607v1.b(this.f21854b)) {
            case 0:
                return this.f21855c;
            case 1:
                return this.f21856d;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f21858f ? 0.0f : 1.0f;
            case 6:
                return this.f21856d;
            default:
                return Float.NaN;
        }
    }

    public final void c(float[] fArr) {
        switch (AbstractC0607v1.b(this.f21854b)) {
            case 0:
                fArr[0] = this.f21855c;
                return;
            case 1:
                fArr[0] = this.f21856d;
                return;
            case 2:
            case 3:
                int i10 = this.g;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f21858f ? 0.0f : 1.0f;
                return;
            case 6:
                fArr[0] = this.f21856d;
                return;
            default:
                return;
        }
    }

    public final int d() {
        int iB = AbstractC0607v1.b(this.f21854b);
        return (iB == 2 || iB == 3) ? 4 : 1;
    }

    public final void g(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder(CollectionUtils.SET_TYPE);
        String str = this.f21853a;
        sb.append(str);
        String string = sb.toString();
        try {
            int iB = AbstractC0607v1.b(this.f21854b);
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (iB) {
                case 0:
                    cls.getMethod(string, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(string, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(string, cls2).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(string, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + str);
                case 5:
                    cls.getMethod(string, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 6:
                    cls.getMethod(string, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder sbD = android.support.v4.media.session.p.D("cannot access method ", string, "on View \"");
            sbD.append(Y2.a.H(view));
            sbD.append("\"");
            Log.e("TransitionLayout", sbD.toString());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            StringBuilder sbD2 = android.support.v4.media.session.p.D("no method ", string, "on View \"");
            sbD2.append(Y2.a.H(view));
            sbD2.append("\"");
            Log.e("TransitionLayout", sbD2.toString());
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public final void h(Object obj) {
        switch (AbstractC0607v1.b(this.f21854b)) {
            case 0:
                this.f21855c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f21856d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f21857e = (String) obj;
                break;
            case 5:
                this.f21858f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f21856d = ((Float) obj).floatValue();
                break;
        }
    }
}
