package V;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public final class m extends RippleDrawable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q f8363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f8364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8365u;

    public m(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f8362r = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f8362r) {
            this.f8365u = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f8365u = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f8365u;
    }
}
