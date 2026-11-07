package T7;

import J1.g;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.ayah.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a extends R1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f7858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f7859r;

    public a(c cVar) {
        super(cVar);
        this.f7859r = new Rect();
        this.f7858q = cVar;
    }

    @Override // R1.a
    public final int n(float f3, float f7) {
        int i10 = 0;
        while (true) {
            c cVar = this.f7858q;
            if (i10 >= cVar.getValues().size()) {
                return -1;
            }
            Rect rect = this.f7859r;
            cVar.v(i10, rect);
            if (rect.contains((int) f3, (int) f7)) {
                return i10;
            }
            i10++;
        }
    }

    @Override // R1.a
    public final void o(ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f7858q.getValues().size(); i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // R1.a
    public final boolean s(int i10, int i11, Bundle bundle) {
        c cVar = this.f7858q;
        if (!cVar.isEnabled()) {
            return false;
        }
        if (i11 != 4096 && i11 != 8192) {
            if (i11 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !cVar.t(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            cVar.w();
            cVar.postInvalidate();
            p(i10);
            return true;
        }
        float fRound = cVar.f7909p0;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        float f3 = (cVar.f7905l0 - cVar.f7904k0) / fRound;
        float f7 = 20;
        if (f3 > f7) {
            fRound *= Math.round(f3 / f7);
        }
        if (i11 == 8192) {
            fRound = -fRound;
        }
        if (cVar.k()) {
            fRound = -fRound;
        }
        if (!cVar.t(i10, B9.a.h(cVar.getValues().get(i10).floatValue() + fRound, cVar.getValueFrom(), cVar.getValueTo()))) {
            return false;
        }
        cVar.w();
        cVar.postInvalidate();
        p(i10);
        return true;
    }

    @Override // R1.a
    public final void u(int i10, g gVar) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        gVar.b(J1.d.f4209t);
        c cVar = this.f7858q;
        List<Float> values = cVar.getValues();
        Float f3 = values.get(i10);
        float fFloatValue = f3.floatValue();
        float valueFrom = cVar.getValueFrom();
        float valueTo = cVar.getValueTo();
        if (cVar.isEnabled()) {
            if (fFloatValue > valueFrom) {
                gVar.a(8192);
            }
            if (fFloatValue < valueTo) {
                gVar.a(4096);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        gVar.m(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (cVar.getContentDescription() != null) {
            sb.append(cVar.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", f3);
        String string2 = cVar.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            if (i10 == cVar.getValues().size() - 1) {
                string = cVar.getContext().getString(R.string.material_slider_range_end);
            } else {
                string = i10 == 0 ? cVar.getContext().getString(R.string.material_slider_range_start) : "";
            }
            string2 = string;
        }
        Locale locale = Locale.US;
        sb.append(string2 + ", " + str);
        gVar.p(sb.toString());
        Rect rect = this.f7859r;
        cVar.v(i10, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
