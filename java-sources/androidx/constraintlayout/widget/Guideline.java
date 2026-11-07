package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import s1.c;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        c cVar = (c) getLayoutParams();
        cVar.f21881a = i10;
        setLayoutParams(cVar);
    }

    public void setGuidelineEnd(int i10) {
        c cVar = (c) getLayoutParams();
        cVar.f21883b = i10;
        setLayoutParams(cVar);
    }

    public void setGuidelinePercent(float f3) {
        c cVar = (c) getLayoutParams();
        cVar.f21885c = f3;
        setLayoutParams(cVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
