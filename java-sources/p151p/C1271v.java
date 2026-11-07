package p151p;

import A1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.b;
import android.support.v4.media.c;
import android.support.v4.media.e;
import android.util.Log;
import com.ayah.R;
import p181s2.s;

/* JADX INFO: renamed from: p.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1271v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cloneable f20793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20795f;

    /* JADX WARN: Type inference failed for: r0v5, types: [int[], java.lang.Cloneable] */
    public C1271v() {
        this.f20790a = new int[]{2131230837, 2131230835, 2131230761};
        this.f20791b = new int[]{2131230785, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f20792c = new int[]{2131230834, 2131230836, 2131230778, R.drawable.abc_text_cursor_material, 2131230831, 2131230832, 2131230833};
        this.f20793d = new int[]{2131230810, R.drawable.abc_cab_background_internal_bg, 2131230809};
        this.f20794e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f20795f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i10) {
        int iC = Y0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{Y0.f20630b, Y0.f20632d, Y0.f20631c, Y0.f20634f}, new int[]{Y0.b(context, R.attr.colorButtonNormal), a.c(iC, i10), a.c(iC, i10), i10});
    }

    public static LayerDrawable d(H0 h7, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableF = h7.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = h7.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1273w.f20796b;
        }
        drawableMutate.setColorFilter(C1273w.c(i10, mode));
    }

    public void c() {
        Messenger messenger;
        c cVar = ((e) this.f20795f).f11306a;
        L5.c cVar2 = cVar.f11303f;
        if (cVar2 != null && (messenger = cVar.g) != null) {
            try {
                cVar2.N(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        cVar.f11299b.disconnect();
        ((BroadcastReceiver.PendingResult) this.f20794e).finish();
    }

    public ColorStateList e(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return s.e(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230827) {
            return s.e(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, Y0.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return b(context, Y0.c(context, R.attr.colorAccent));
            }
            if (i10 == 2131230822 || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return s.e(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f20791b, i10)) {
                return Y0.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f20794e, i10)) {
                return s.e(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f20795f, i10)) {
                return s.e(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return s.e(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = Y0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = Y0.f20630b;
            iArr2[0] = Y0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = Y0.f20633e;
            iArr2[1] = Y0.c(context, R.attr.colorControlActivated);
            iArr[2] = Y0.f20634f;
            iArr2[2] = Y0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = Y0.f20630b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = Y0.f20633e;
            iArr2[1] = Y0.c(context, R.attr.colorControlActivated);
            iArr[2] = Y0.f20634f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public C1271v(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f20790a = new b(this);
        this.f20792c = context;
        this.f20793d = intent;
        this.f20794e = pendingResult;
    }
}
