package p084i;

import H7.ViewOnClickListenerC0238l;
import I1.J;
import I1.S;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.ayah.R;
import java.util.WeakHashMap;
import p151p.C1268t0;

/* JADX INFO: renamed from: i.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0959g extends z implements DialogInterface {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0958f f16607w;

    public DialogInterfaceC0959g(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, g(contextThemeWrapper, i10));
        this.f16607w = new C0958f(getContext(), this, getWindow());
    }

    public static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p084i.z, p020c.k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C0958f c0958f = this.f16607w;
        c0958f.f16584b.setContentView(c0958f.f16606z);
        Context context = c0958f.f16583a;
        Window window = c0958f.f16585c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c0958f.g;
        if (view == null) {
            view = null;
        }
        boolean z10 = view != null;
        if (!z10 || !C0958f.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c0958f.f16589h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c0958f.f16588f != null) {
                ((LinearLayout.LayoutParams) ((C1268t0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = C0958f.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = C0958f.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = C0958f.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0958f.f16598r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0958f.f16598r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        c0958f.f16602v = textView;
        if (textView != null) {
            CharSequence charSequence = c0958f.f16587e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0958f.f16598r.removeView(c0958f.f16602v);
                if (c0958f.f16588f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0958f.f16598r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0958f.f16598r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0958f.f16588f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        c0958f.f16590i = button;
        ViewOnClickListenerC0238l viewOnClickListenerC0238l = c0958f.f16582G;
        button.setOnClickListener(viewOnClickListenerC0238l);
        if (TextUtils.isEmpty(c0958f.j)) {
            c0958f.f16590i.setVisibility(8);
            i10 = 0;
        } else {
            c0958f.f16590i.setText(c0958f.j);
            c0958f.f16590i.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        c0958f.f16592l = button2;
        button2.setOnClickListener(viewOnClickListenerC0238l);
        if (TextUtils.isEmpty(c0958f.f16593m)) {
            c0958f.f16592l.setVisibility(8);
        } else {
            c0958f.f16592l.setText(c0958f.f16593m);
            c0958f.f16592l.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        c0958f.f16595o = button3;
        button3.setOnClickListener(viewOnClickListenerC0238l);
        if (TextUtils.isEmpty(c0958f.f16596p)) {
            c0958f.f16595o.setVisibility(8);
        } else {
            c0958f.f16595o.setText(c0958f.f16596p);
            c0958f.f16595o.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = c0958f.f16590i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = c0958f.f16592l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = c0958f.f16595o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (c0958f.f16603w != null) {
            viewGroupB.addView(c0958f.f16603w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0958f.f16600t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0958f.f16586d) || !c0958f.f16580E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0958f.f16600t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0958f.f16601u = textView2;
                textView2.setText(c0958f.f16586d);
                Drawable drawable = c0958f.f16599s;
                if (drawable != null) {
                    c0958f.f16600t.setImageDrawable(drawable);
                } else {
                    c0958f.f16601u.setPadding(c0958f.f16600t.getPaddingLeft(), c0958f.f16600t.getPaddingTop(), c0958f.f16600t.getPaddingRight(), c0958f.f16600t.getPaddingBottom());
                    c0958f.f16600t.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z13 = viewGroupB3.getVisibility() != 8;
        if (!z13 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z12 != 0) {
            NestedScrollView nestedScrollView2 = c0958f.f16598r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0958f.f16587e == null && c0958f.f16588f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0958f.f16588f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.setHasDecor(z12, z13);
        }
        if (!z11) {
            View view2 = c0958f.f16588f;
            if (view2 == null) {
                view2 = c0958f.f16598r;
            }
            if (view2 != null) {
                int i11 = z13 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = S.f3689a;
                J.b(view2, z12 | i11, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0958f.f16588f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0958f.f16604x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i12 = c0958f.f16605y;
        if (i12 > -1) {
            alertController$RecycleListView2.setItemChecked(i12, true);
            alertController$RecycleListView2.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16607w.f16598r;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16607w.f16598r;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // p084i.z, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0958f c0958f = this.f16607w;
        c0958f.f16586d = charSequence;
        TextView textView = c0958f.f16601u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
