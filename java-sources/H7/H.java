package H7;

import E2.C0140p;
import I1.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.ayah.R;
import com.google.android.material.appbar.MaterialToolbar;
import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3447a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3448b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0140p f3449c = new C0140p(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3450d = 0;

    public static void a(float f3, float[] fArr) {
        if (f3 <= 0.5f) {
            fArr[0] = 1.0f - (f3 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f3 * 2.0f) - 1.0f;
        }
    }

    public static Rect b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, view2.getWidth() + i12, view2.getHeight() + i13);
    }

    public static void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19668h0, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                e(context, f3448b, "Theme.MaterialComponents");
            }
        }
        e(context, f3447a, "Theme.AppCompat");
    }

    public static void d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19668h0, i10, i11);
        boolean z10 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int length = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z10 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i12], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i12++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z10 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(p245z2.a.D("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void f(View view, L l10) {
        WeakHashMap weakHashMap = S.f3689a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        M m10 = new M();
        m10.f3458a = paddingStart;
        m10.f3459b = paddingTop;
        m10.f3460c = paddingEnd;
        m10.f3461d = paddingBottom;
        I1.I.m(view, new M.k(20, l10, m10));
        if (view.isAttachedToWindow()) {
            I1.G.c(view);
        } else {
            view.addOnAttachStateChangeListener(new K(0));
        }
    }

    public static float g(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static ActionMenuView h(Toolbar toolbar) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ViewGroup i(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ImageButton j(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList k(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < materialToolbar.getChildCount(); i10++) {
            View childAt = materialToolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean l(View view) {
        WeakHashMap weakHashMap = S.f3689a;
        return view.getLayoutDirection() == 1;
    }

    public static TypedArray m(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        c(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static p074h0.i n(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        c(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return new p074h0.i(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public static PorterDuff.Mode o(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
