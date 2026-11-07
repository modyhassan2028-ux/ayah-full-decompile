package X2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.measurement.B1;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g implements Animatable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f9869x = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f9871t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public F7.e f9872u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f9873v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f9874w = new c(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f9870s = new d();

    public e(Context context, int i10) {
        this.f9871t = context;
    }

    @Override // X2.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f9870s;
        dVar.f9865a.draw(canvas);
        if (dVar.f9866b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getAlpha() : this.f9870s.f9865a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f9870s.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getColorFilter() : this.f9870s.f9865a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9876r == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new F7.c(this.f9876r.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f9870s.f9865a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f9870s.f9865a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getOpacity() : this.f9870s.f9865a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        d dVar;
        Animator animatorA;
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i10 = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f9870s;
            if (eventType == i10 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = p244z1.a.i(resources, theme, attributeSet, a.f9857e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVarA = p.a(resources, resourceId, theme);
                        pVarA.f9928w = false;
                        pVarA.setCallback(this.f9874w);
                        p pVar = dVar.f9865a;
                        if (pVar != null) {
                            pVar.setCallback(null);
                        }
                        dVar.f9865a = pVarA;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f9858f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(i10, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f9871t;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorA = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorA = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e10) {
                                        e = e10;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e11) {
                                        e = e11;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != null) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (IOException e12) {
                                e = e12;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                            }
                        }
                        animatorA.setTarget(dVar.f9865a.f9924s.f9913b.f9911o.get(string));
                        if (dVar.f9867c == null) {
                            dVar.f9867c = new ArrayList();
                            dVar.f9868d = new C1350e(0);
                        }
                        dVar.f9867c.add(animatorA);
                        dVar.f9868d.put(animatorA, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i10 = 1;
        }
        if (dVar.f9866b == null) {
            dVar.f9866b = new AnimatorSet();
        }
        dVar.f9866b.playTogether(dVar.f9867c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.isAutoMirrored() : this.f9870s.f9865a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f9876r;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f9870s.f9866b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.isStateful() : this.f9870s.f9865a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f9870s.f9865a.setBounds(rect);
        }
    }

    @Override // X2.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.setLevel(i10) : this.f9870s.f9865a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.setState(iArr) : this.f9870s.f9865a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f9870s.f9865a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f9870s.f9865a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9870s.f9865a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            B1.I(drawable, i10);
        } else {
            this.f9870s.f9865a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f9870s.f9865a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f9870s.f9865a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f9870s.f9865a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f9870s;
        if (dVar.f9866b.isStarted()) {
            return;
        }
        dVar.f9866b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f9870s.f9866b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
