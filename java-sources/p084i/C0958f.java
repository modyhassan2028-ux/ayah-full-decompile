package p084i;

import H7.ViewOnClickListenerC0238l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.support.v4.media.session.i;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.ayah.R;
import java.lang.ref.WeakReference;
import p073h.a;

/* JADX INFO: renamed from: i.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16576A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f16577B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16578C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f16579D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f16580E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final i f16581F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0959g f16584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f16585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f16586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f16587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f16588f;
    public View g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f16590i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f16591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f16592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f16593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f16594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f16595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f16596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f16597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f16598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f16599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f16600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f16601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f16602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f16603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f16604x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f16606z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16589h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16605y = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ViewOnClickListenerC0238l f16582G = new ViewOnClickListenerC0238l(3, this);

    public C0958f(Context context, DialogInterfaceC0959g dialogInterfaceC0959g, Window window) {
        this.f16583a = context;
        this.f16584b = dialogInterfaceC0959g;
        this.f16585c = window;
        i iVar = new i(1);
        iVar.f11345b = new WeakReference(dialogInterfaceC0959g);
        this.f16581F = iVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f16385f, R.attr.alertDialogStyle, 0);
        this.f16606z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f16576A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f16577B = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f16578C = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f16579D = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f16580E = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0959g.e().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f16581F.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f16596p = charSequence;
            this.f16597q = messageObtainMessage;
        } else if (i10 == -2) {
            this.f16593m = charSequence;
            this.f16594n = messageObtainMessage;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.f16591k = messageObtainMessage;
        }
    }
}
