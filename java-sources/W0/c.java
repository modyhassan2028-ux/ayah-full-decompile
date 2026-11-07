package W0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BreakIterator f9488s;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f9488s = characterInstance;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final int N(int i10) {
        return this.f9488s.following(i10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final int Q(int i10) {
        return this.f9488s.preceding(i10);
    }
}
