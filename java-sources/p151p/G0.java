package p151p;

import X2.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import p102k.e;
import p111l.a;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20546a;

    public /* synthetic */ G0(int i10) {
        this.f20546a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f20546a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) G0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            case 1:
                try {
                    return e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e11) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e11);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    X2.e eVar = new X2.e(context, 0);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e12) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e12);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    p pVar = new p();
                    pVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return pVar;
                } catch (Exception e13) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
        }
    }
}
