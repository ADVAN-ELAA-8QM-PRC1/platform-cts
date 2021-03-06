/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.location.cts.asn1.supl2.ulp_version_2_parameter_extensions;

/*
 */


//
//
import android.location.cts.asn1.base.Asn1BitString;
import android.location.cts.asn1.base.Asn1Tag;
import android.location.cts.asn1.base.BitStream;
import android.location.cts.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 */
public  class DGANSS_Sig_Id_Req extends Asn1BitString {
  //

  private static final Asn1Tag TAG_DGANSS_Sig_Id_Req
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGANSS_Sig_Id_Req() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGANSS_Sig_Id_Req;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGANSS_Sig_Id_Req != null) {
      return ImmutableList.of(TAG_DGANSS_Sig_Id_Req);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGANSS_Sig_Id_Req from encoded stream.
   */
  public static DGANSS_Sig_Id_Req fromPerUnaligned(byte[] encodedBytes) {
    DGANSS_Sig_Id_Req result = new DGANSS_Sig_Id_Req();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGANSS_Sig_Id_Req from encoded stream.
   */
  public static DGANSS_Sig_Id_Req fromPerAligned(byte[] encodedBytes) {
    DGANSS_Sig_Id_Req result = new DGANSS_Sig_Id_Req();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "DGANSS_Sig_Id_Req = " + getValue() + ";\n";
  }
}
