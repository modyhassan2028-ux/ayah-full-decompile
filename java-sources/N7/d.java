package N7;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class d extends B0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f6054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextPaint f6055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B0.c f6056f;
    public final /* synthetic */ e g;

    public d(e eVar, Context context, TextPaint textPaint, B0.c cVar) {
        this.g = eVar;
        this.f6054d = context;
        this.f6055e = textPaint;
        this.f6056f = cVar;
    }

    @Override // B0.c
    public final void W(int i10) {
        this.f6056f.W(i10);
    }

    @Override // B0.c
    public final void X(Typeface typeface, boolean z10) {
        this.g.g(this.f6054d, this.f6055e, typeface);
        this.f6056f.X(typeface, z10);
    }
}
