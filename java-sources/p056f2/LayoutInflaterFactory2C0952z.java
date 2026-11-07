package p056f2;

import K0.j1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import p044e2.a;
import p064g2.b;
import p064g2.c;

/* JADX INFO: renamed from: f2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0952z implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K f16182r;

    public LayoutInflaterFactory2C0952z(K k7) {
        this.f16182r = k7;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        Q qG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        K k7 = this.f16182r;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, k7);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f15754a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0947u.class.isAssignableFrom(D.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uC = resourceId != -1 ? k7.C(resourceId) : null;
                    if (abstractComponentCallbacksC0947uC == null && string != null) {
                        abstractComponentCallbacksC0947uC = k7.D(string);
                    }
                    if (abstractComponentCallbacksC0947uC == null && id != -1) {
                        abstractComponentCallbacksC0947uC = k7.C(id);
                    }
                    if (abstractComponentCallbacksC0947uC == null) {
                        D dH = k7.H();
                        context.getClassLoader();
                        abstractComponentCallbacksC0947uC = dH.a(attributeValue);
                        abstractComponentCallbacksC0947uC.f16131E = true;
                        abstractComponentCallbacksC0947uC.f16141O = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0947uC.f16142P = id;
                        abstractComponentCallbacksC0947uC.Q = string;
                        abstractComponentCallbacksC0947uC.f16132F = true;
                        abstractComponentCallbacksC0947uC.f16137K = k7;
                        C0949w c0949w = k7.f15982w;
                        abstractComponentCallbacksC0947uC.f16138L = c0949w;
                        FragmentActivity fragmentActivity = c0949w.f16173s;
                        abstractComponentCallbacksC0947uC.f16143V = true;
                        if ((c0949w != null ? c0949w.f16172r : null) != null) {
                            abstractComponentCallbacksC0947uC.f16143V = true;
                        }
                        qG = k7.a(abstractComponentCallbacksC0947uC);
                        if (K.K(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0947uC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0947uC.f16132F) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0947uC.f16132F = true;
                        abstractComponentCallbacksC0947uC.f16137K = k7;
                        C0949w c0949w2 = k7.f15982w;
                        abstractComponentCallbacksC0947uC.f16138L = c0949w2;
                        FragmentActivity fragmentActivity2 = c0949w2.f16173s;
                        abstractComponentCallbacksC0947uC.f16143V = true;
                        if ((c0949w2 != null ? c0949w2.f16172r : null) != null) {
                            abstractComponentCallbacksC0947uC.f16143V = true;
                        }
                        qG = k7.g(abstractComponentCallbacksC0947uC);
                        if (K.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0947uC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    b bVar = c.f16271a;
                    c.b(new p064g2.a(abstractComponentCallbacksC0947uC, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0947uC + " to container " + viewGroup));
                    c.a(abstractComponentCallbacksC0947uC).getClass();
                    abstractComponentCallbacksC0947uC.f16144W = viewGroup;
                    qG.k();
                    qG.j();
                    View view2 = abstractComponentCallbacksC0947uC.f16145X;
                    if (view2 == null) {
                        throw new IllegalStateException(p245z2.a.D("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0947uC.f16145X.getTag() == null) {
                        abstractComponentCallbacksC0947uC.f16145X.setTag(string);
                    }
                    abstractComponentCallbacksC0947uC.f16145X.addOnAttachStateChangeListener(new j1(this, qG));
                    return abstractComponentCallbacksC0947uC.f16145X;
                }
            }
        }
        return null;
    }
}
