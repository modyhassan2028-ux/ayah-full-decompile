package p137n7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f20023a = new O(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f20024b = new O(0);

    public static e a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static e b(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public static e c(ArrayList arrayList) {
        e eVar = new e();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            eVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f20016b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f20017c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f20018d;
            }
            f fVar = new f();
            fVar.f20028d = 0;
            fVar.f20029e = 1;
            fVar.f20025a = startDelay;
            fVar.f20026b = duration;
            fVar.f20027c = interpolator;
            fVar.f20028d = objectAnimator.getRepeatCount();
            fVar.f20029e = objectAnimator.getRepeatMode();
            eVar.f20023a.put(propertyName, fVar);
        }
        return eVar;
    }

    public final ObjectAnimator d(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, e(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        f(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f20024b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f20023a.equals(((e) obj).f20023a);
        }
        return false;
    }

    public final f f(String str) {
        O o10 = this.f20023a;
        if (o10.get(str) != null) {
            return (f) o10.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean g(String str) {
        return this.f20024b.get(str) != null;
    }

    public final void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f20024b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f20023a.hashCode();
    }

    public final String toString() {
        return "\n" + e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f20023a + "}\n";
    }
}
