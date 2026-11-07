package p151p;

import I1.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import p073h.a;
import p074h0.i;

/* JADX INFO: renamed from: p.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1269u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f20782a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f20783b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20784c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20785d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f20787f;

    public /* synthetic */ C1269u(TextView textView) {
        this.f20787f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f20787f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f20784c || this.f20785d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f20784c) {
                    drawableMutate.setTintList(this.f20782a);
                }
                if (this.f20785d) {
                    drawableMutate.setTintMode(this.f20783b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.f20787f;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f20784c || this.f20785d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f20784c) {
                    drawableMutate.setTintList(this.f20782a);
                }
                if (this.f20785d) {
                    drawableMutate.setTintMode(this.f20783b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f20787f;
        Context context = compoundButton.getContext();
        int[] iArr = a.f16391n;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        S.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(Y2.a.E(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(Y2.a.E(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(Y2.a.E(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(iVarB.q(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC1249j0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            iVarB.C();
        }
    }
}
