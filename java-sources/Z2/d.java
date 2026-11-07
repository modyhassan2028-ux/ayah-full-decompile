package Z2;

import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d extends SingleLineTransformationMethod {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Locale f10970r;

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f10970r);
        }
        return null;
    }
}
