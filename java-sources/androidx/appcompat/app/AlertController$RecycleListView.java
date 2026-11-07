package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p073h.a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11387s;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public void setHasDecor(boolean z10, boolean z11) {
        if (z11 && z10) {
            return;
        }
        setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f11386r, getPaddingRight(), z11 ? getPaddingBottom() : this.f11387s);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16399v);
        this.f11387s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f11386r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
