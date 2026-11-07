package W2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: W2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0627h {
    public static <T, V> ObjectAnimator a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
