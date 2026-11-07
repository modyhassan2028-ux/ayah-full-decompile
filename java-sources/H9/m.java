package H9;

import android.text.SpannableStringBuilder;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Pattern f3641r;

    public m(String str) {
        p251z9.j.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        p251z9.j.d(patternCompile, "compile(...)");
        this.f3641r = patternCompile;
    }

    public static G9.g a(m mVar, SpannableStringBuilder spannableStringBuilder) {
        mVar.getClass();
        if (spannableStringBuilder.length() >= 0) {
            return new G9.g(new G4.f(6, mVar, spannableStringBuilder), l.f3640z, 2);
        }
        StringBuilder sbW = p123m2.c.w(0, "Start index out of bounds: ", ", input length: ");
        sbW.append(spannableStringBuilder.length());
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    public final k b(int i10, String str) {
        p251z9.j.e(str, "input");
        Matcher matcherRegion = this.f3641r.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i10, str.length());
        if (matcherRegion.lookingAt()) {
            return new k(matcherRegion, str);
        }
        return null;
    }

    public final k c(String str) {
        p251z9.j.e(str, "input");
        Matcher matcher = this.f3641r.matcher(str);
        p251z9.j.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new k(matcher, str);
        }
        return null;
    }

    public final String d(String str) {
        p251z9.j.e(str, "input");
        String strReplaceAll = this.f3641r.matcher(str).replaceAll("");
        p251z9.j.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f3641r.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    public m(String str, int i10) {
        p251z9.j.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str, 66);
        p251z9.j.d(patternCompile, "compile(...)");
        this.f3641r = patternCompile;
    }
}
