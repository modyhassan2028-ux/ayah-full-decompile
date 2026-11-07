package androidx.core.graphics.drawable;

import B1.a;
import B1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f12333k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f12336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f12337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12339f;
    public ColorStateList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f12340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12341i;
    public String j;

    public IconCompat() {
        this.f12334a = -1;
        this.f12336c = null;
        this.f12337d = null;
        this.f12338e = 0;
        this.f12339f = 0;
        this.g = null;
        this.f12340h = f12333k;
        this.f12341i = null;
    }

    public static Bitmap c(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f3 = iMin;
        float f7 = 0.5f * f3;
        float f10 = 0.9166667f * f7;
        if (z10) {
            float f11 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f10, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f12338e = i10;
        if (resources != null) {
            try {
                iconCompat.f12335b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f12335b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int e() {
        int i10 = this.f12334a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f12338e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f12335b;
        if (i11 >= 28) {
            return a.d(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final Uri f() {
        int i10 = this.f12334a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f12335b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f12335b;
        if (i11 >= 28) {
            return a.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon g(Context context) {
        Icon iconCreateWithBitmap;
        String strE;
        InputStream inputStreamOpenInputStream;
        int i10 = Build.VERSION.SDK_INT;
        switch (this.f12334a) {
            case -1:
                return (Icon) this.f12335b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f12335b);
                break;
            case 2:
                int i11 = this.f12334a;
                if (i11 == -1) {
                    int i12 = Build.VERSION.SDK_INT;
                    Object obj = this.f12335b;
                    if (i12 >= 28) {
                        strE = a.e(obj);
                    } else {
                        strE = null;
                        try {
                            strE = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.j;
                    strE = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f12335b).split(":", -1)[0] : this.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strE, this.f12338e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f12335b, this.f12338e, this.f12339f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f12335b);
                break;
            case 5:
                iconCreateWithBitmap = i10 < 26 ? Icon.createWithBitmap(c((Bitmap) this.f12335b, false)) : Z6.a.a((Bitmap) this.f12335b);
                break;
            case 6:
                if (i10 >= 30) {
                    iconCreateWithBitmap = b.a(f());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + f());
                    }
                    Uri uriF = f();
                    String scheme = uriF.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriF);
                        } catch (Exception e13) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriF, e13);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f12335b));
                        } catch (FileNotFoundException e14) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriF, e14);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + f());
                    }
                    if (i10 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(c(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = Z6.a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f12340h;
        if (mode != f12333k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f12334a == -1) {
            return String.valueOf(this.f12335b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f12334a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f12334a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f12335b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f12335b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f12338e);
                if (this.f12339f != 0) {
                    sb.append(" off=");
                    sb.append(this.f12339f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f12335b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.f12340h != f12333k) {
            sb.append(" mode=");
            sb.append(this.f12340h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f12336c = null;
        this.f12337d = null;
        this.f12338e = 0;
        this.f12339f = 0;
        this.g = null;
        this.f12340h = f12333k;
        this.f12341i = null;
        this.f12334a = i10;
    }
}
