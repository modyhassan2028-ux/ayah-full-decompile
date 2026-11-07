package p192t6;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DynamicDrawableSpan {
    @Override // android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        colorDrawable.setBounds(0, 0, 1, 1);
        return colorDrawable;
    }
}
