package geojson;

public class GeoJsonParserTests {
  
  public final static String point = 
    "{ \"type\": \"Point\", \"coordinates\": [100.0, 0.0] }";
  
  public final static String multipoint = 
    "{ \"type\": \"MultiPoint\",\"coordinates\": [ [100.0, 0.0], [101.0, 1.0] ]}";
  
  public final static String line = 
    "{ \"type\": \"LineString\", \"coordinates\": [[100.0, 0.0], [110.0, 1.0]]}";
  
  public final static String multiline = 
    "{ \"type\": \"MultiLineString\",\"coordinates\": [[ [100.0, 0.0], [101.0, 1.0] ],[ [102.0, 2.0], [103.0, 3.0] ]]}";
  
  public final static String polygon = 
    "{ \"type\": \"Polygon\",    \"coordinates\":[ [ [100.0, 0.0], [101.0, 0.0], [101.0, 1.0], [100.0, 1.0], [100.0, 0.0] ]]}";
  
  public final static String polygon_with_hole = 
      "{ \"type\": \"Polygon\",    \"coordinates\": [      [ [100.0, 0.0], [101.0, 0.0], [101.0, 1.0], [100.0, 1.0], [100.0, 0.0] ],      [ [100.2, 0.2], [100.8, 0.2], [100.8, 0.8], [100.2, 0.8], [100.2, 0.2] ]      ]}";
  
  public final static String multipolygon = 
    "{ \"type\": \"MultiPolygon\",    \"coordinates\": [      [[[102.0, 2.0], [103.0, 2.0], [103.0, 3.0], [102.0, 3.0], [102.0, 2.0]]],      [[[100.0, 0.0], [101.0, 0.0], [101.0, 1.0], [100.0, 1.0], [100.0, 0.0]],       [[100.2, 0.2], [100.8, 0.2], [100.8, 0.8], [100.2, 0.8], [100.2, 0.2]]]      ]    }";
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
