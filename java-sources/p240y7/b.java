package p240y7;

import J1.d;
import J1.g;
import R1.a;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ayah.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f24657q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Chip chip, Chip chip2) {
        super(chip2);
        this.f24657q = chip;
    }

    @Override // R1.a
    public final int n(float f3, float f7) {
        Rect rect = Chip.f14789O;
        Chip chip = this.f24657q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f3, f7)) ? 1 : 0;
    }

    @Override // R1.a
    public final void o(ArrayList arrayList) {
        d dVar;
        arrayList.add(0);
        Rect rect = Chip.f14789O;
        Chip chip = this.f24657q;
        if (!chip.d() || (dVar = chip.f14805v) == null || !dVar.f24690c0 || chip.f14808y == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // R1.a
    public final boolean s(int i10, int i11, Bundle bundle) {
        boolean z10 = false;
        if (i11 == 16) {
            Chip chip = this.f24657q;
            if (i10 == 0) {
                return chip.performClick();
            }
            if (i10 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f14808y;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z10 = true;
                }
                if (chip.f14801K) {
                    chip.f14800J.x(1, 1);
                }
            }
        }
        return z10;
    }

    @Override // R1.a
    public final void t(g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        Chip chip = this.f24657q;
        d dVar = chip.f14805v;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f24696i0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.m(chip.getAccessibilityClassName());
        gVar.x(chip.getText());
    }

    @Override // R1.a
    public final void u(int i10, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        if (i10 != 1) {
            gVar.p("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f14789O);
            return;
        }
        Chip chip = this.f24657q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            gVar.p(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            gVar.p(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        gVar.b(d.g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // R1.a
    public final void v(int i10, boolean z10) {
        if (i10 == 1) {
            Chip chip = this.f24657q;
            chip.f14795E = z10;
            chip.refreshDrawableState();
        }
    }
}
