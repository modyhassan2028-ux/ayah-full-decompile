package p151p;

import I1.S;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.ayah.R;
import p073h.a;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements InterfaceC1241f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f20674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f20676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f20677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f20678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f20679f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f20680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f20681i;
    public final CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f20682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1250k f20684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f20686o;

    public i1(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f20685n = 0;
        this.f20674a = toolbar;
        this.f20680h = toolbar.getTitle();
        this.f20681i = toolbar.getSubtitle();
        this.g = this.f20680h != null;
        this.f20679f = toolbar.getNavigationIcon();
        i iVarB = i.B(toolbar.getContext(), null, a.f16380a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        int i10 = 15;
        this.f20686o = iVarB.r(15);
        if (z10) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.f20680h = text;
                if ((this.f20675b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        S.p(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f20681i = text2;
                if ((this.f20675b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableR = iVarB.r(20);
            if (drawableR != null) {
                this.f20678e = drawableR;
                c();
            }
            Drawable drawableR2 = iVarB.r(17);
            if (drawableR2 != null) {
                this.f20677d = drawableR2;
                c();
            }
            if (this.f20679f == null && (drawable = this.f20686o) != null) {
                this.f20679f = drawable;
                if ((this.f20675b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f20676c;
                if (view != null && (this.f20675b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f20676c = viewInflate;
                if (viewInflate != null && (this.f20675b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f20675b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f20686o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f20675b = i10;
        }
        iVarB.C();
        if (R.string.abc_action_bar_up_description != this.f20685n) {
            this.f20685n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i11 = this.f20685n;
                this.j = i11 != 0 ? toolbar.getContext().getString(i11) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new h1(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f20675b ^ i10;
        this.f20675b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f20674a;
            if (i12 != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f20675b & 4) != 0) {
                    Drawable drawable = this.f20679f;
                    if (drawable == null) {
                        drawable = this.f20686o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f20680h);
                    toolbar.setSubtitle(this.f20681i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f20676c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f20675b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f20674a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f20685n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f20675b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f20678e) == null) {
            drawable = this.f20677d;
        }
        this.f20674a.setLogo(drawable);
    }
}
